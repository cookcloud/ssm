
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.hy.bean.Depart;
import com.hy.mapper.DepartMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class JavaTest {

    public static SqlSessionFactory getSqlSeesionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);

    }
}
