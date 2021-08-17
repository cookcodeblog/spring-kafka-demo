package cn.xdevops.controller;

import cn.xdevops.model.User;
import cn.xdevops.service.UserProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserProducer userProducer;

    @PostMapping
    public void createUser(@RequestBody User user) {
        userProducer.createUser(user);
    }
}
