package com.ssm.Dao;

import com.ssm.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @discription: AccountDao_xml
 * Created by mingli on 2022/4/20 16:21.
 */

@Mapper
public interface AccountDao_xml {

    Account findByID(int id);

}
