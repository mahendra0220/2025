package com.maahi.demo.Repo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "users")
public class User {
    @JsonProperty("name")
    String name;

    @JsonProperty("mobile")
    String mobile;
     @Id
    @JsonProperty("emailId")
    String emailId;

    @JsonProperty("dob")
    String dob;
}
