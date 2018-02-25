package activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by sunjx on 2018/2/25.
 * 进一步封装jmstemplate 的send方法
 */
@Service
public class ActiveMQProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(final String msg){
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });

    }
}
