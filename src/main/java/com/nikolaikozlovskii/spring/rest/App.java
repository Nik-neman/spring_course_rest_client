package com.nikolaikozlovskii.spring.rest;


import com.nikolaikozlovskii.spring.rest.configuration.MyConfig;
import com.nikolaikozlovskii.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);

//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1500);
//        emp.setId(14);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(14);
    }
}
