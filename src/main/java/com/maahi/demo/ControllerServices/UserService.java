package com.maahi.demo.ControllerServices;

import com.maahi.demo.Repo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

     @Autowired
    private MongoTemplate mongoTemplate;

    public void saveUser(User request) {
     mongoTemplate.insert(request);
    }


}
