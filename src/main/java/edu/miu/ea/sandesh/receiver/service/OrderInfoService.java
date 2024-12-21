package edu.miu.ea.sandesh.receiver.service;

import edu.miu.ea.sandesh.receiver.entity.OrderInfo;
import edu.miu.ea.sandesh.receiver.repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInfoService {
    @Autowired
    OrderInfoRepository orderInfoRepository;


    public OrderInfo save(OrderInfo orderInfo) {
        return orderInfoRepository.save(orderInfo);
    }
    public List<OrderInfo> findAll() {
        return orderInfoRepository.findAll();
    }
}
