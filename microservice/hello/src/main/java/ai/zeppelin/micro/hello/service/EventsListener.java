package ai.zeppelin.micro.hello.service;

import ai.zeppelin.micro.hello.event.Event;
import ai.zeppelin.micro.hello.stream.EventsStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventsListener {
    @StreamListener(EventsStream.INPUT)
    public void handleGreetings(@Payload Event event) {
        log.info("Received greetings: {}", event);
    }
}