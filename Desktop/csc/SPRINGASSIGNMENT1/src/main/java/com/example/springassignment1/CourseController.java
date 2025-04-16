package com.example.springassignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //foundation courses
    @GetMapping("/foundation")
    public List<String> getFoundationCourses() {
        return Arrays.asList(
                "CSC111F - Computer Literacy for Science",
                "CSC121F - Introduction to Programming Concepts"
        );
    }

    //undergraduate courses
    @GetMapping("/undergraduate")
    public List<String> getUndergraduateCourses() {
        return Arrays.asList(
                "CSC113 - Introduction to Computing and Programming Concepts ",
                "CSC121 - Elementary Computer Programming",
                "CSC211 - Advanced Programming",
                "CSC212 - Computer Architecture and Organisation",
                "CSC313 - Object Oriented Programming"
        );
    }

    //honours courses
    @GetMapping("/honours")
    public List<String> getHonoursCourses() {
        return Arrays.asList(
                "CSC512 - Computer Networks ",
                "CSC513 - Distributed and Parallel Computing",
                "CSC515 - Advanced Java ",
                "CSC521 - Computer Graphics "
        );
    }
}

