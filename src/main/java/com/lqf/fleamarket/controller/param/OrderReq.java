package com.lqf.fleamarket.controller.param;

import lombok.Data;

/**
 * @Description detail
 * Created by lqf on 2021/5/7 16:40
 */
@Data
public class OrderReq {
    private long buyerId;
    private long commodityId;
    private int num;
    private String note;
}
