package com.maahi.demo.Controller;

import com.maahi.demo.ControllerServices.UserService;
import com.maahi.demo.Repo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class commonController {

    @Autowired
    private UserService userService;

@GetMapping("/getuser")
@ResponseBody
    public String getUserByMailId(){
    System.out.println("user details fetched");
    return "fetched";
    }
    @PostMapping("/saveuser")
    public ResponseEntity<User> updateUser(@RequestBody User request){

        userService.saveUser(request);
        return ResponseEntity.status(HttpStatus.OK).body(request);
    }
}
