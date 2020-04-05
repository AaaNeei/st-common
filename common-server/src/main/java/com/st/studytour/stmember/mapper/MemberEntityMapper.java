package com.st.studytour.stmember.mapper;

import com.st.studytour.stmember.entity.MemberEntity;

public interface MemberEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberEntity record);

    int insertSelective(MemberEntity record);

    MemberEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberEntity record);

    int updateByPrimaryKey(MemberEntity record);
}