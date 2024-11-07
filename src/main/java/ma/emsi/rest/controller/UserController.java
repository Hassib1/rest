package ma.emsi.rest.controller;

import ma.emsi.rest.model.User;
import ma.emsi.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        User user=userService.getUser(id);
        if(user!=null){
            return user;
        }
        return null;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
    @DeleteMapping("/supp")
    public void SupprimerUser(@RequestParam Integer id) {
        userService.suppUser(id);
    }}
