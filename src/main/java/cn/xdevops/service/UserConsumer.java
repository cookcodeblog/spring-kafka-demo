package cn.xdevops.service;

import cn.xdevops.constants.KafkaConstants;
import cn.xdevops.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserConsumer {

    @KafkaListener(topics = KafkaConstants.TOPIC_USERS, groupId = KafkaConstants.CONSUMER_GROUP)
    public void consume(User user) {
        log.info(String.format("#### -> Consumed message -> %s", user));
    }
}
