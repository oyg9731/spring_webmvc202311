package com.spring.mvc;

import com.spring.mvc.chap06.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RequestMapping("/rests")
@Slf4j
@RestController
//@ResponseBody
public class RestApiController {


    @GetMapping("/hello")
    @ResponseBody // 클라이언트에게 JSP를 보내는게 아니라 JSON을 보내는 방법
    public String hello() {
        log.info("/rest/hello GET!");
        return "hello apple banana!!";
    }

    @GetMapping("/food")
    @ResponseBody
    public List<String> food(){
        return List.of("짜짱면", "짬뽕", "탕쑤윢");
    }

    @GetMapping("/person")
    public Person person(){
        return new Person("334", "말포이", 50);
    }


}
