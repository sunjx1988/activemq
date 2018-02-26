package topicmsgmanyconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sunjx on 2018/2/26.
 * 当订阅后，如果中途中断接收消息，则下次开始接收消息的时候会一次性补齐未接受的消息
 * 但是订阅前未接受的消息不接收
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-activemq-topic-consumer2.xml"})
public class Consumer2 {

    @Test
    public void main(){
        System.out.println("Consumer2 持久化 开始监听");
        while (true){

        }
    }
}
