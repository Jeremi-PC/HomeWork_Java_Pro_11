package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.*;

import static org.junit.Assert.assertEquals;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserTestClass {

    private String firstName;
    private String lastName;
    private int age;
    private String[] favoriteDishes = {"Steak", "Vegetables", "Fruits"};

}