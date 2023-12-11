package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

     UserTestClass user = new UserTestClass();
     user.setFirstName("Emanuel");
     user.setLastName("Grey");
     user.setAge(45);
     String dishes = Arrays.toString(user.getFavoriteDishes());
     boolean isEquals = user.getFirstName().equals(user.getLastName());
     System.out.println(isEquals);
     System.out.printf("User %s %s %d years old. Has a few favorite dishes: %s%n", user.getLastName(), user.getFirstName(), user.getAge(), dishes);

    // при создании экземпляра класса все поля, геттеры, сеттеры и метод equals доступны.
    }
}