package com.example;

import com.example.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02JunitApplicationTests {

    @Autowired
    private BookService bookService;


    @Test
    public void testBookService(){
        bookService.run();
    }

    @Test
    void contextLoads() {
        System.out.println("test...");
    }

}
