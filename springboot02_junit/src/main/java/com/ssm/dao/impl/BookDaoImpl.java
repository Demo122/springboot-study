package com.ssm.dao.impl;

import com.ssm.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @discription: BookDaoImpl
 * Created by mingli on 2022/4/17 19:00.
 */

@Repository
public class BookDaoImpl  implements BookDao {

    @Override
    public void run() {
        System.out.println("book dao running...");
    }
}
