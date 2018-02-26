package transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sunjx on 2018/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-activemq-transaction-consumer.xml"})
public class Consumer {

    @Test
    public void main(){
        System.out.println("Consumer  开始监听");
        while (true){

        }
    }
}
