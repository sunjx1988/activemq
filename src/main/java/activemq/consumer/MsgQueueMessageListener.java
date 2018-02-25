package activemq.consumer;

import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Created by sunjx on 2018/2/25.
 */
public class MsgQueueMessageListener implements SessionAwareMessageListener<Message> {

    public void onMessage(Message message, Session session) throws JMSException {

        if(message instanceof TextMessage){
            TextMessage msg = (TextMessage) message;
            System.out.println("consumer get msg :" + msg.getText());
        }
    }
}
