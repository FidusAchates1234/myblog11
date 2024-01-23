package com.myblog.myblog11;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("mike", 30, "chennai"),
                new Employee("stallin", 28, "hyderabad"),
                new Employee("adam", 25, "Bengaluru"),
                new Employee("sam",34,"chennai")
        );
       // List<Employee> emps = employees.stream().filter(emp -> emp.getAge()>25).collect(Collectors.toList());
       /* for(Employee e:emps){
            System.out.println(e.getName());
            System.out.println(e.getAge());
            System.out.println(e.getCity());*/

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e ->e.getCity()));
        System.out.println(collect);
        }
    }
