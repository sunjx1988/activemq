package transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import transaction.producer.TransactionProducer;

/**
 * Created by sunjx on 2018/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-activemq-transaction-producer.xml"})
public class Producer {

    @Autowired
    private TransactionProducer transactionProducer;

    @Test
    public void main(){
        System.out.println("开始默认持久化产生消息");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                transactionProducer.sendMessage(Long.toString(System.currentTimeMillis()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
