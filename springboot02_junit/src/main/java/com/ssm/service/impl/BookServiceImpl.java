package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @discription: BookServiceImpl
 * Created by mingli on 2022/4/17 19:02.
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void run() {
        bookDao.run();
    }
}
