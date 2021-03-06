package ai.zeppelin.micro.hello.event;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder
public class Event {
    private long timestamp;
    private String message;
}
