package edu.miu.ea.sandesh.receiver.controller;

import edu.miu.ea.sandesh.receiver.entity.OrderInfo;
import edu.miu.ea.sandesh.receiver.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/message")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping()
    public List<OrderInfo> orderInfos() {
        return orderInfoService.findAll();
    }
}
