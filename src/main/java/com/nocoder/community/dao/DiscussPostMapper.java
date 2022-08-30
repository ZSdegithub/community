package com.nocoder.community.dao;

import com.nocoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //offset起始页 limit显示页面的数量
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset") int offset, @Param("limit") int limit);

    //@Param注解用于给参数起别名，
    //若只有一个参数，并且在if中使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);


}
