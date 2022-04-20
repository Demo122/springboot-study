package com.ssm.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ssm.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @discription: AccountDao
 * Created by mingli on 2022/4/18 16:50.
 */

@Mapper
public interface AccountDao extends BaseMapper<Account> {

}
