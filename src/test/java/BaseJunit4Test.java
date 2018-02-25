import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sunjx on 2018/2/25.
 * 创建一个spring for junit 基类，方便创建测试类的时候不用再配置 runwith ， contextConfiguration
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class BaseJunit4Test {
}
