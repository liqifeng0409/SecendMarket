package com.lqf.fleamarket.controller;

import com.lqf.fleamarket.service.CommentService;
import com.lqf.fleamarket.service.CommodityService;
import com.lqf.fleamarket.service.OrderService;
import com.lqf.fleamarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description detail
 * Created by lqf on 2021/5/7 16:47
 */
@RequestMapping("/api")
public class BaseController {
    @Autowired
    UserService userService;
    @Autowired
    CommodityService commodityService;
    @Autowired
    OrderService orderService;
    @Autowired
    CommentService commentService;
}
