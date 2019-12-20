package com.fedorg.api;

import com.fedorg.api.Entity.Message;
import com.fedorg.api.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/messages")
public class MessageApi {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping
    public List<Message> getAll(){
        return (List<Message>) messageRepository.findAll();
    }

    @GetMapping("{id}")
    public Message getById(@PathVariable Long id){
        return messageRepository.findById(id).get();
    }

    @PostMapping //TODO add null filters
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody @Valid Message message){
        return messageRepository.save(message);
    }

    @PutMapping("{id}") //TODO fix put requests
    public Message update(@PathVariable Long id, @RequestBody Message message){
        if (message.getId() == null){
            message.setId(id);
        }
        return messageRepository.save(message);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        messageRepository.deleteById(id);
    }
}
