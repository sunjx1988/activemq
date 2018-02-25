import activemq.producer.ActiveMQProducer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunjx on 2018/2/25.
 * 简单消息发送，接收测试类 P2P模式
 */
public class ActiveMQTest extends BaseJunit4Test{

    @Autowired
    private ActiveMQProducer activeMQProducer;

    @Test
    public void simpleTest(){
        activeMQProducer.sendMessage("hello world !!!");
    }
}
