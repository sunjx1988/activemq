package activemq.topic.consumer;

import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.*;

/**
 * Created by sunjx on 2018/2/25.
 */
public class TopicMsgConsumer implements SessionAwareMessageListener<Message> {


    public void onMessage(Message message, Session session) throws JMSException {
        if(message instanceof TextMessage){
            TextMessage msg = (TextMessage) message;
            System.out.println("topic : " + msg.getJMSDestination() + ", msgid : " + msg.getJMSMessageID() + ", content :" + msg.getText());
        }
    }
}
