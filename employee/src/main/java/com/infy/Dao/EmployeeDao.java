package com.infy.Dao;


import com.infy.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository

public class EmployeeDao {

private static Map<Integer, Employee> employee;

static {
    employee=new HashMap<Integer, Employee>(){
        {
            put(1,new Employee(1001,"pratap","Mech",50000));
            put(2,new Employee(1002,"pr1","Sci",20000));
            put(3,new Employee(1003,"pr2","civil",30000));

        }
    };
}

//@Override
public Collection<Employee> getAllEmployee(){
    return employee.values();
}

}