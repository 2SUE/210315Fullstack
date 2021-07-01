package com.sue.facebookclone.feed;

import com.sue.facebookclone.feed.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper {
    int insFeed(FeedEntity param);
    int insFeedImg(FeedImgEntity param);
    List<FeedDomain> selFeedList();
    List<FeedDomain2> selFeedList2(FeedDTO param);

    int insFeedFav(FeedFavEntity param);
    int delFeedFav(FeedFavEntity param);

    int insFeedCmt(FeedCmtEntity param);
    List<FeedCmtDomain> selFeedCmtList(FeedCmtEntity param);
}