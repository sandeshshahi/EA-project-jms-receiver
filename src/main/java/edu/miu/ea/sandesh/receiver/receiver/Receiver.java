package edu.miu.ea.sandesh.receiver.receiver;

import edu.miu.ea.sandesh.receiver.entity.OrderInfo;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Map;

@Component
public class Receiver {
    @JmsListener(destination = "${springjms.queueName}")
    public void receiveMessage(Map<String,?> orderObject) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setId((Long)orderObject.get("id"));
        orderInfo.setOrderDate((String) orderObject.get("orderDate"));
        orderInfo.setTotalPrice((Double) orderObject.get("totalPrice"));
        System.out.println(orderInfo);
    }
}
