package com.lqf.fleamarket.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description detail
 * Created by lqf on 2021/5/8 11:37
 */
@Data
@NoArgsConstructor
public class CommentResp {
    private long id;
    private long commentId;
    private long reviewerId;
    private String reviewerName;
    private long replierId;
    private String replierName;
    private long parentId;
    private String comment;
}
