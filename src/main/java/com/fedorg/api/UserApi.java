package com.fedorg.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserApi {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getAll(){
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("{id}")
    public User getById(@PathVariable Long id){
        return userRepository.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody @Valid User user){
        return userRepository.save(user);
    }

    @PutMapping("{id}")
    public User update(@PathVariable Long id, @RequestBody User user){
        if (user.getId() == null){
            user.setId(id);
        }
        return userRepository.save(user);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
