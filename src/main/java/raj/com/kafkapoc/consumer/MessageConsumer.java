package raj.com.kafkapoc.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @KafkaListener(topics = "baeldung", groupId = "kafkapoc")
    public void listen(String message) {
        LOGGER.error("Received messages in group kafkapoc: " + message);
    }
}
