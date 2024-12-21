package edu.miu.ea.sandesh.receiver.repository;


import edu.miu.ea.sandesh.receiver.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {
}
