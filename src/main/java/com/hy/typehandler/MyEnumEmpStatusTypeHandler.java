package com.hy.typehandler;

import com.hy.bean.EnumDepartStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 1、实现TypeHandler接口。或者继承BaseTypeHandler
 *  就是
 * @author lfy
 */
public class MyEnumEmpStatusTypeHandler implements TypeHandler<EnumDepartStatus> {
    /**
     * 定义当前数据如何保存到数据库中:即将枚举状态中的的状态码code写进数据库中
     */
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, EnumDepartStatus enumDepartStatus, JdbcType jdbcType) throws SQLException {
//        System.out.println("要保存的状态码："+enumDepartStatus.getCode());
        preparedStatement.setString(i, String.valueOf(enumDepartStatus.getCode()));
    }

    @Override
    public EnumDepartStatus getResult(ResultSet resultSet, String s) throws SQLException {
        //需要根据从数据库中拿到的枚举的状态码返回一个枚举对象  即：获取到数据中的状态码后，根据自定义的枚举对象中返回相对应的枚举对象状态
        int code = resultSet.getInt(s);
//        System.out.println("从数据库中获取的状态码："+code);
        EnumDepartStatus enumDepartStatus = EnumDepartStatus.getMsgByCode(code);
        return enumDepartStatus;
    }

    @Override
    public EnumDepartStatus getResult(ResultSet resultSet, int i) throws SQLException {
        int code = resultSet.getInt(i);
//        System.out.println("从数据库中获取的状态码："+code);
        EnumDepartStatus status = EnumDepartStatus.getMsgByCode(code);
        return status;
    }

    @Override
    public EnumDepartStatus getResult(CallableStatement callableStatement, int i) throws SQLException {

        int code = callableStatement.getInt(i);
//        System.out.println("从数据库中获取的状态码："+code);
        EnumDepartStatus status = EnumDepartStatus.getMsgByCode(code);
        return status;
    }
}
