package com.java.intrprep.java8.easy;

import java.util.ArrayList;
import java.util.List;

public class FlatenListOfList {

    private record User(
            int id,
            String name,
            List<String> skills
    ){}

    public static void main(String[] args) {
        List<User> userList = List.of(
                new User(1,"Ben",List.of("Java","Springboot")),
                new User(2,"Rick",List.of("React","JavaScript"))
        );

        List<String> result = userList.stream()
                .flatMap(user -> user.skills.stream())
                .toList();
        System.out.println(result);
    }
}
