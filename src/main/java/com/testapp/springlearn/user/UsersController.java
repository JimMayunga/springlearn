package com.testapp.springlearn.user;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.springlearn.location.Location;

@RestController
public class UsersController {

    @RequestMapping("/users")
    public List<Users> getAllUsers() {

        Users user1 = new Users(
                "u1",
                "Jane",
                "Doe",
                new Location("l1", "Nakuru"),
                "janedoe@gmail.com");

        Users user2 = new Users(
                "u2",
                "Jim",
                "Mayunga",
                new Location("l2", "Nairobi"),
                "jimmayunga@gmail.com");

        return Arrays.asList(user1, user2);
    }

}
