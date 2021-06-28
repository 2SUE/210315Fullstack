package com.sue.facebookclone.user;

import com.sue.facebookclone.user.model.UserEntity;
import com.sue.facebookclone.user.model.UserProfileEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserProfileMapper {
    int insUserProfile(UserProfileEntity param);
    List<UserProfileEntity> selUserProfileList(UserEntity param);
}
