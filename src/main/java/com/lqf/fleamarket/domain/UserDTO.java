package com.lqf.fleamarket.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Description detail
 * Created by lqf on 2021/5/16 17:13
 */
@Data
public class UserDTO {
    private long id;
    private String name;
    private Date createdOn;
    private String email;
}
