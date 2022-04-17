package com.example.dao.impl;

import com.example.dao.BookDao;
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
