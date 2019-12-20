package com.fedorg.api;

import com.fedorg.api.Entity.Message;
import com.fedorg.api.Entity.Users;
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
        Users user1 = new Users("ira", "1234", "aj", new Date());
        Users user2 = new Users("ivan", "qwerty", "kwe", new Date());
        userRepository.save(user1);
        userRepository.save(user2);

        Message message1 = new Message("hello", new Date());
        Message message2 = new Message("no", new Date()); //TODO local date and time
        messageRepository.save(message1);
        messageRepository.save(message2);

    }
}
