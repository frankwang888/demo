package com.client.eurekaclient.dao;

import com.client.eurekaclient.domain.SysJob;
import com.client.eurekaclient.domain.SysJobExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysJobMapper {
    long countByExample(SysJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysJob record);

    int insertSelective(SysJob record);

    List<SysJob> selectByExample(SysJobExample example);

    SysJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysJob record);

    int updateByPrimaryKey(SysJob record);
}