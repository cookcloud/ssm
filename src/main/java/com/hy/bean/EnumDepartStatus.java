package com.hy.bean;


/*
必须在枚举类的第一行声明枚举类对象。
        枚举类和普通类的区别：
        ①使用 enum 定义的枚举类默认继承了 java.lang.Enum 类
        ②枚举类的构造器只能使用 private 访问控制符
        ③枚举类的所有实例必须在枚举类中显式列出(, 分隔 ; 结尾). 列出的实例系统会自动添加 public static final 修饰
*/

/**
 * 希望数据库保存的是100,200这些状态码，而不是默认枚举的索引至0,1等或者枚举的名，枚举的名就是LOGIN、LOGOUT、REMOVE
 *  LOGIN(100, "用户登录")、 LOGOUT(200, "用户登出")、REMOVE(300, "用户不存在")是实例化的EnumDepartStatus对象
 */
public enum EnumDepartStatus {
    LOGIN(100, "用户登录"),
    LOGOUT(200, "用户登出"),
    REMOVE(300, "用户不存在");
    private int code;
    private String msg;

    public static EnumDepartStatus  getMsgByCode(int code) {
        EnumDepartStatus[] values = EnumDepartStatus.values();
        for (EnumDepartStatus myEnum : values) {

            if (myEnum.code == code) {
                return myEnum;
            }
        }
        return null;
    }

    private EnumDepartStatus() {
    }

    private EnumDepartStatus(int code, String msg) {

        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
