import activemq.producer.ActiveMQProducer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sunjx on 2018/2/25.
 */
public class ActiveMQTest extends BaseJunit4Test{

    @Autowired
    private ActiveMQProducer activeMQProducer;

    @Test
    public void simpleTest(){
        activeMQProducer.sendMessage("hello world !!!");
    }
}
