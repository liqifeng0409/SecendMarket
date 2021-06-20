package com.lqf.fleamarket.dao.repo;

import com.lqf.fleamarket.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Description detail
 * Created by lqf on 2021/5/6 11:27
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmailAndPassword(@Param("email") String email,@Param("password") String password);
    UserEntity findByEmail(@Param("email") String email);
    List<UserEntity> findAllByRole(int role);
}
