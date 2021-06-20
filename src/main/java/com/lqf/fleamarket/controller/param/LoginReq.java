package com.lqf.fleamarket.controller.param;

import lombok.Data;

/**
 * @Description detail
 * Created by lqf on 2021/5/6 17:44
 */
@Data
public class LoginReq {
    private String email;
    private String password;
    private int role;
}
