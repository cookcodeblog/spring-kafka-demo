package cn.xdevops.service;

import cn.xdevops.constants.KafkaConstants;
import cn.xdevops.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserProducer {
    private final KafkaTemplate<String, User> kafkaTemplate;

    public void createUser(User user) {
        log.info(String.format("#### -> Producing message -> %s", user));
        kafkaTemplate.send(KafkaConstants.TOPIC_USERS, user);
    }
}
