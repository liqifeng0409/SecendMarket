package com.lqf.fleamarket.controller.param;

import lombok.Data;

/**
 * @Description detail
 * Created by lqf on 2021/5/8 11:49
 */
@Data
public class CommentRespReq {
    private long commentId;
    private long reviewerId;
    private long replierId;
    private long parentId;
    private String comment;
}
