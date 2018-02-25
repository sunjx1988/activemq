package activemq.topic.producer;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by sunjx on 2018/2/25.
 */
@Service
public class TopicMsgProducer {

    @Resource(name = "topicProducer")
    private JmsTemplate jmsTemplate;

    public void sendTopicMessage(final String msg){

        jmsTemplate.send(jmsTemplate.getDefaultDestination(), new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                System.out.println("topic producer send msg!!!");
                return session.createTextMessage(msg);
            }
        });
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
}
