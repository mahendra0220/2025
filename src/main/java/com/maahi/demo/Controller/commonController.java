package com.maahi.demo.Controller;

import com.maahi.demo.Repo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class commonController {

@GetMapping("/getuser")
@ResponseBody
    public String getUserByMailId(){
    System.out.println("user details fetched");
    return "fetched";
    }
    @PostMapping("/saveuser")
    public void updateUser(User request){
  System.out.println("user details saved");
    }
}
