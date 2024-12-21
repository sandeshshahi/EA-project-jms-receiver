package edu.miu.ea.sandesh.receiver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class OrderInfo {
    @Id
    private Long id;
    private String orderDate;
    private Double totalPrice;

    public OrderInfo() {
    }

    public OrderInfo(Long id, String orderDate, Double totalPrice) {
        this.id = id;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
