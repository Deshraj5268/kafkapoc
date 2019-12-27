package raj.com.kafkapoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import raj.com.kafkapoc.producer.MessagePublisher;

@RestController
@RequestMapping(path ="/kafka"/*, produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE*/)
public class KafkaController {

    @Autowired
    private MessagePublisher messagePublisher;

    @GetMapping(value = "/publish/{message}")
    public void publicMessage(@RequestBody @PathVariable(value = "message") String message){
        messagePublisher.sendMessage(message);
    }
}
