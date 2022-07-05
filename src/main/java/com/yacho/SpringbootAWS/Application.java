package com.yacho.SpringbootAWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정한다.
@SpringBootApplication // @SpringBootApplication 있는 클래스가 가장 최상단 디렉토리에 위치해야 한다.
public class Application {
    public static void main(String[] args) { SpringApplication.run(Application.class,args); }
}

//@SpringBootApplication어노테이션을 이용하여
////        1. **스프링 부트 자동설정**
////        2. **스프링 Bean 읽기와 생성을 모두 자동으로 설정**
////        특히나 @SpringBootApplication이 위치한 클래스로부터 설정을 읽어나가기 때문에
////@SpringBootApplication이 위치한 클래스를 다른 클래스보다 프로젝트의 최상단에 위치시켜야한다.
////        ___________________________________________________________________________________________________
////        SpringApplication.run 을 이용하여 내장 WAS(spring)를 실행시킨다.
////        이렇게 사용할 경우 Tomcat을 사용할 필요가 없으니 어떤 환경에서든지 단순 jar로만 배포가 가능하다