package com.github.hcsp.inheritance;

import java.util.Objects;

public class User extends Object{
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new User(1, "user1") == new User(1, "user1"));
        System.out.println(new User(1, "user1").equals(new User(1, "user1")));
        System.out.println(new User(1, "user1").equals(new User(2, "user2")));
    }

    // 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true
    @Override
    public boolean equals(Object obj) {
        if(Objects.equals(null, obj)){
            return false;
        }

        if(obj instanceof User){
            User user = (User)obj;
            return Objects.equals(user.getId(), id);
        }

        return false;
    }
}
