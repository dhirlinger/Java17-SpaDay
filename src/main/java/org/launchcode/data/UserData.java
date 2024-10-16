package org.launchcode.data;

import org.launchcode.models.User;

import java.util.*;

public class UserData {
    private static final Map<Integer, User> users = new HashMap<>();

    public static void add(User user){
        users.put(user.getId(), user);
    }

    public static User getById(int id){
        return users.get(id);
    }

    public static Collection<User> getAll(){
        return users.values();
    }

}
