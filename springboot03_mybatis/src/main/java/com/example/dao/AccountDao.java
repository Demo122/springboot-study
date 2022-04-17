package com.example.dao;

import com.example.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @discription: AccountDao
 * Created by mingli on 2022/4/17 19:29.
 */

@Mapper
public interface AccountDao {

    @Select("select * from account where id=#{id}")
    Account getAccountByID(int id);

}
