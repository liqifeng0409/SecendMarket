package com.lqf.fleamarket.dao.repo;

import com.lqf.fleamarket.dao.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description detail
 * Created by lqf on 2021/5/6 11:28
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    List<OrderEntity> findAllByBuyerId(long buyerId);
    List<OrderEntity> findAllBySellerId(long sellerId);
}
