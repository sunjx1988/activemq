import activemq.topic.producer.TopicMsgProducer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by sunjx on 2018/2/25.
 * 订阅发布模式消息测试
 */
@ContextConfiguration(locations = {"classpath:spring-activemq-topic.xml"})
public class TopicMsgTest extends BaseJunit4Test {

    @Autowired
    private TopicMsgProducer topicMsgProducer;

    @Test
    public void topicMsgTest(){
        String inputString = null;

        for (int i = 0; i < 10; i++) {
            inputString = Integer.toString(i);
            topicMsgProducer.sendTopicMessage(inputString);
        }

    }

    @Test
    public void test(){
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
