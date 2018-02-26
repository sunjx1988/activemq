package transaction.producer;

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
public class TransactionProducer {

    @Resource(name = "queueMsgProducer")
    private JmsTemplate jmsTemplate;

    public void sendMessage(final String msg){

        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                System.out.println(msg);
                return session.createTextMessage(msg);
            }
        });
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
}
