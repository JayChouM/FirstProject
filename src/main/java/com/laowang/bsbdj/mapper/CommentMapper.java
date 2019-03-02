package com.laowang.bsbdj.mapper;

import com.laowang.bsbdj.entity.Comment;

public interface CommentMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);
}