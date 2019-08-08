package section.demo.controller;

import section.demo.entity.User;
import section.demo.model.UserSection;
import section.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService){ this.userService = userService;}

    @GetMapping("/section/{id}")
    public List<UserSection> getSection(@PathVariable("id") Long id){
        return userService.getSection(id);
    }

    @GetMapping("/{id}")
    public User getProfile(@PathVariable("id") Long id){
        return userService.getProfile(id);
    }

    @PostMapping()
    public User addUser(@RequestBody User user){return userService.addUser(user);}

    @PutMapping("/{id}")
    public User editUser(@RequestBody User user,
                         @PathVariable("id") Long id){
            return userService.editUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){}
}
