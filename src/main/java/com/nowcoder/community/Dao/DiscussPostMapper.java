package com.nowcoder.community.Dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DiscussPostMapper {
    //public List<DiscussPost> selectDiscussPosts(@Param("userId") int userId,@Param("offset") int offset,@Param("limit") int limit);
    public List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);
    public int selectDiscussPostRows(@Param("userId")int userId);
}
