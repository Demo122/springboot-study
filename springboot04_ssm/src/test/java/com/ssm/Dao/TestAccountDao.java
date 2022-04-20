package com.ssm.Dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ssm.pojo.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;

/**
 * @discription: TestAccountDao
 * Created by mingli on 2022/4/18 16:54.
 */

@SpringBootTest
public class TestAccountDao {
    @Autowired
    private AccountDao accountDao;

    @Test
    public void testAccountDao() {
        System.out.println(accountDao.selectById(1));
    }

    @Test
    public void testAccountDao1() {
        Account account = new Account();
        account.setName("王五");
        account.setMoney(5131564);
        accountDao.insert(account);
    }

    @Test
    public void testAccountDao2() {
        accountDao.deleteById(23);
    }

    @Test
    public void testAccountDao3() {
        IPage iPage = new Page(1, 5);
        System.out.println(accountDao.selectPage(iPage, null));
    }

    @Test
    public void testAccountDao22() {
        LambdaQueryWrapper<Account> lw=new LambdaQueryWrapper<>();
        lw.like(Account::getName,"l");
        System.out.println(accountDao.selectList(lw));
    }

    @Test
    public void testAccountDao23() {
        accountDao.deleteById(23);
    }

    @Test
    public void testAccountDao24() {
        accountDao.deleteById(23);
    }

    @Test
    public void testAccountDao26() {
        accountDao.deleteById(23);
    }

    @Test
    public void testAccountDao25() {
        accountDao.deleteById(23);
    }

}
