package com.sue.facebookclone.user;

import com.sue.facebookclone.user.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int join(UserEntity param);
}