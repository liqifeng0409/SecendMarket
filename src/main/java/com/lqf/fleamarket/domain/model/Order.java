package com.lqf.fleamarket.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description detail
 * Created by lqf on 2021/5/6 11:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private long id;
    private long buyerId;
    private String commodityName;
    private String photoUrl;
    private long sellerId;
    private float price;
    private int num;
    private String note;
    private int status;
    private Date createdOn;
}
