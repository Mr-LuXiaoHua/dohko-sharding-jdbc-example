package com.dohko.mapper;

import com.dohko.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int insert(User user);


    User selectById(Long userId);
}
