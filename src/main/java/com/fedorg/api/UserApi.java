package com.fedorg.api;

import com.fedorg.api.Entity.Users;
import com.fedorg.api.repositories.UserRepository;
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
    public List<Users> getAll(){
        return (List<Users>) userRepository.findAll();
    }

    @GetMapping("{id}")
    public Users getById(@PathVariable Long id){
        return userRepository.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Users save(@RequestBody @Valid Users user){
        return userRepository.save(user);
    }

    @PutMapping("{id}")
    public Users update(@PathVariable Long id, @RequestBody Users user){
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
