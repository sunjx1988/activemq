import activemq.queue.producer.ActiveMQProducer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

/**
 * Created by sunjx on 2018/2/25.
 * 简单消息发送，接收测试类 P2P模式
 */
@ContextConfiguration(locations = {"classpath:spring-activemq-queue.xml"})
public class QueueMsgTest extends BaseJunit4Test{

    @Autowired
    private ActiveMQProducer activeMQProducer;

    @Test
    public void simpleTest(){
        activeMQProducer.sendMessage("hello world !!!");
    }
}
