package ai.zeppelin.micro.hello.config;


import ai.zeppelin.micro.hello.stream.EventsStream;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.config.EnableIntegration;

@EnableBinding(EventsStream.class)
@EnableIntegration
public class StreamsConfig {

}