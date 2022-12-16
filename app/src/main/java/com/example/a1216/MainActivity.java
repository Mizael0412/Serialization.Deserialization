package com.example.a1216;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        Address address = new Address("Germany", "Berlin");
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 30));
        family.add(new FamilyMember("Husband", 45));

        // create employee

        Employee employee = new Employee("john", 30, "jonhmail", address, family);
        String json = gson.toJson(employee);
        String json2 =gson.toJson(family);

        Employee employee2 = gson.fromJson(json, Employee.class);
        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        ArrayList<FamilyMember> family2 = gson.fromJson(json2,familyType);


    }
}