package com.ssm.Dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @discription: TestAccountDao_xml
 * Created by mingli on 2022/4/20 16:24.
 */

@SpringBootTest
public class TestAccountDao_xml {

    @Autowired
    private AccountDao_xml accountDao_xml;


    @Test
    public void testFindByID(){
        System.out.println(accountDao_xml.findByID(1));
    }

}
