package me.js.springboot;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// 이 리스너는 타입을 주어야함 <>
// ApplicationStartedEvent는 ApplicationContext가 생성되기 전에 실행되기떄문에 해당 빈이 생성되지 않아 실행되지 않음
// 이런 경우 직접 메인에 등록해줘야함
//@Component //따라서 빈으로 등록하는 의미가 없다
public class StartingListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("=======================");
        System.out.println("Application is Starting");
        System.out.println("=======================");
    }
}
