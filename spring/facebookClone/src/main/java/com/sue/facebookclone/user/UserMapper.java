package com.sue.facebookclone.user;

import com.sue.facebookclone.user.model.UserEntity;
import com.sue.facebookclone.user.model.UserProfileEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int join(UserEntity param);
    UserEntity selUser(UserEntity param);
    int auth(UserEntity param);
    int updUser(UserEntity param);
    int updUserMainProfile(UserProfileEntity param);
}
