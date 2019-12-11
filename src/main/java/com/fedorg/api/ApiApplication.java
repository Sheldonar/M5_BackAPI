package com.fedorg.api;

import com.fedorg.api.Entity.Message;
import com.fedorg.api.Entity.User;
import com.fedorg.api.repositories.MessageRepository;
import com.fedorg.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("ira", "1234", new Date());
        User user2 = new User("ivan", "qwerty", new Date());
        userRepository.save(user1);
        userRepository.save(user2);

        Message message1 = new Message("FUCK YOU BITCH", "ira", "ivan", new Date());
        Message message2 = new Message("your mom gay", "ivan", "ira", new Date());
        messageRepository.save(message1);
        messageRepository.save(message2);

    }
}
