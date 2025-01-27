package com.maahi.demo.Repo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    String name;
    String mobile;
    String emailId;
    String dob;
}
