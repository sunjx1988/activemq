package topicmsgmanyconsumer;

import activemq.topic.producer.TopicMsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sunjx on 2018/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-activemq-topic-producer.xml"})
public class Producer {

    @Autowired
    private TopicMsgProducer topicMsgProducer;

    @Test
    public void main(){
        System.out.println("开始默认持久化产生消息");
        while (true){
            try {
                Thread.sleep(1000);
                topicMsgProducer.sendTopicMessage(Long.toString(System.currentTimeMillis()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
