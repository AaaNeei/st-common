package com.st.studytour.stmember.mapper;

import com.st.studytour.stmember.entity.MemberInformationEntity;
import com.st.studytour.stmember.entity.MemberInformationEntityWithBLOBs;

public interface MemberInformationEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberInformationEntityWithBLOBs record);

    int insertSelective(MemberInformationEntityWithBLOBs record);

    MemberInformationEntityWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberInformationEntityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MemberInformationEntityWithBLOBs record);

    int updateByPrimaryKey(MemberInformationEntity record);
}