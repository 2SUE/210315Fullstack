package com.sue.facebookclone.feed;

import com.sue.facebookclone.feed.model.FeedEntity;
import com.sue.facebookclone.feed.model.FeedImgEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedMapper {
    int insFeed(FeedEntity param);
    int insFeedImg(FeedImgEntity param);
}
