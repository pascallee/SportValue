package com.tinubu.first.presentation;

import com.tinubu.first.biz.service.UserService;
import com.tinubu.first.model.User;
import com.tinubu.first.util.MessageError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

/**
 * @author Pascal Lee
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ApplicationContext applicationContext;
    
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<User> getUsers() {
        UserService userService = applicationContext.getBean("userService", UserService.class);
        return userService.getUsers();        
    }

    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public User getUser(@PathVariable("userId") int userId) {
        UserService userService = applicationContext.getBean("userService", UserService.class);
        return userService.getUser(userId);
    }

    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(@PathVariable("userId") int userId, @RequestBody @Valid User user) {
        UserService userService = applicationContext.getBean("userService", UserService.class);
        user.setId(userId);
        userService.updateUser(user);
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public MessageError handleException(Throwable e, HttpServletResponse response) throws IOException {
        return new MessageError(e.getMessage());
    }
}
