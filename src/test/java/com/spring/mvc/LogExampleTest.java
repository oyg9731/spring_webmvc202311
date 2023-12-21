package com.spring.mvc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogExampleTest {

    @Autowired
    LogExample logExample;

    @Test
    @DisplayName("로그 레벨 체크하기")
    void logTest() {
        //given

        //when
        logExample.showLog();
        //then
    }
}