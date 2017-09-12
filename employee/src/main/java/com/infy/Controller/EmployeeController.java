package com.infy.Controller;

import com.infy.Entity.Employee;
import com.infy.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
@Autowired
    private EmployeeServices employeeServices;
@RequestMapping(method = RequestMethod.GET)
    public Collection<Employee>getAllEmployee(){
        return this.employeeServices.getAllEmployee();
    }


}
