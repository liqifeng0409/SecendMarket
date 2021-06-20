package com.lqf.fleamarket.service;

import com.lqf.fleamarket.controller.param.OrderReq;
import com.lqf.fleamarket.domain.model.Order;

import java.util.List;

/**
 * @Description detail
 * Created by lqf on 2021/5/6 11:40
 */
public interface OrderService {
    Order createOrder(OrderReq orderReq);
    Order updateOrder(long id, String note);
    boolean updateStatus(long id, int status);
    void deleteOrder(long id);
    List<Order> getAllByBuyerId(long buyerId);
    List<Order> getAllBySellerId(long sellerId);
}
