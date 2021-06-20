package com.lqf.fleamarket.dao.repo;

import com.lqf.fleamarket.dao.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description detail
 * Created by lqf on 2021/5/6 11:28
 */
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    List<CommentEntity> findAllByCommodityId(long id);
}
