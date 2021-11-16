package com.example.springlearningfromchinesetutorial;

import com.example.springlearningfromchinesetutorial.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// burasi springboot icin unit test yapulacak

@SpringBootTest
class SpringLearningFromChineseTutorialApplicationTests {

    @Autowired
    Person person;


    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
