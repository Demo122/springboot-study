package com.ssm;

import com.ssm.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03MybatisApplicationTests {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void testAccountDao(){
        System.out.println(accountDao.getAccountByID(2));
    }

    @Test
    void contextLoads() {
    }

}
