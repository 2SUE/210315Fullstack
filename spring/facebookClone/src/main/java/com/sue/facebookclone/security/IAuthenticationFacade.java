package com.sue.facebookclone.security;


import com.sue.facebookclone.user.model.UserEntity;

public interface IAuthenticationFacade {
    UserEntity getLoginUser();
    int getLoginUserPk();
}
