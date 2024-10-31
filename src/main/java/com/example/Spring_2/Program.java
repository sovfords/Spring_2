package com.example.Spring_2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Program
{

    public Program()
    {
        System.out.println("Program created");
    }

    @GetMapping("/")
    public String userWelcome()
    {
        return "преветсвуем тебя, пользователь!";
    }
}
