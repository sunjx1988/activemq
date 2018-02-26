package topicmsgmanyconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sunjx on 2018/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-activemq-topic-consumer1.xml"})
public class Consumer1 {

    @Test
    public void main(){
        System.out.println("Consumer1 非持久化 开始监听");
        while (true){

        }
    }
}
