package com.lqf.fleamarket.controller.param;

import lombok.Data;

/**
 * @Description detail
 * Created by lqf on 2021/5/6 15:40
 */
@Data
public class RegisterReq {
    private String name;
    private String email;
    private String password;
}
