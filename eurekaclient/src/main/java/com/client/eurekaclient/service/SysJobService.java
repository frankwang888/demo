package com.client.eurekaclient.service;

import com.client.eurekaclient.dao.SysJobMapper;
import com.client.eurekaclient.domain.SysJobExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: jc
 * @Date: 2019/1/8 10:45
 * @Description:
 */

@Service
public class SysJobService {

    @Autowired
    private SysJobMapper sysJobMapper;

    public long countByExample(SysJobExample example){
        return sysJobMapper.countByExample(example);
    }

}
