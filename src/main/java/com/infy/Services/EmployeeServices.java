package com.infy.Services;

import com.infy.Dao.EmployeeDao;
import com.infy.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeServices {

    @Autowired
    private EmployeeDao employeeDao;

    public Collection<Employee>getAllEmployee(){
        return this.employeeDao.getAllEmployee();
    }


}
