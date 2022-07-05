package com.yacho.SpringbootAWS.web;

import com.yacho.SpringbootAWS.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}


//@RestController
//
//* 컨트롤러를 JSON으로 반환하는 컨트롤러로 만들어준다.(즉, 값을 반환했다 보면 된다.)
//        * 예전에는 @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해준거이라 생각하면 된다.
//
//        참고로 기존 @Controller 는 String이나 Model로 반환시에 해당 이름의 파일을 호출했다.
//        ___________________________________________________________________________________________________
//@GetMapping
//
//* HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어준다.
//        * 예전에는 @RequestMapping(method = RequsetMethod.GET)으로 사용했었다.