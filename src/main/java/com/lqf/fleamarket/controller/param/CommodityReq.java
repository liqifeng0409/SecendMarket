package com.lqf.fleamarket.controller.param;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description detail
 * Created by lqf on 2021/5/7 11:09
 */
@Data
public class CommodityReq {
    private String name;
    private String description;
    private int quantity;
    private float price;
    private long ownerId;
    private MultipartFile photo;
}
