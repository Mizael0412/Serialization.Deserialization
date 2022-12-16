package com.example.a1216;

import java.util.List;

public class Employee {
    private String firstName;
    private int age;
    private String mail;
    private com.example.a1216.Address address;
    private List<FamilyMember> mFamily;

    public Employee(String firstName, int age, String mail, Address adress, List<FamilyMember> family) {
        this.firstName = firstName;
        this.age= age;
        this.mail=mail;
        this.address = adress;
        this.mFamily = family;
    }
}
