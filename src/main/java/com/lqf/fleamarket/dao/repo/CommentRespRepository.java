package com.lqf.fleamarket.dao.repo;

import com.lqf.fleamarket.dao.entity.CommentRespEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description detail
 * Created by lqf on 2021/5/8 16:47
 */
public interface CommentRespRepository extends JpaRepository<CommentRespEntity, Long> {
    List<CommentRespEntity> findAllByCommentId(long id);
}
