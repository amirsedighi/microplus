package ai.zeppelin.micro.hello.controller;

import ai.zeppelin.micro.hello.event.Event;
import ai.zeppelin.micro.hello.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {
        Event event = Event.builder()
                .message(message)
                .timestamp(System.currentTimeMillis())
                .build();
        eventService.sendGreeting(event);
    }
}