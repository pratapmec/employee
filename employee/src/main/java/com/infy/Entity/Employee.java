package com.infy.Entity;

public class Employee {
    private int Empid;
    private String EmpName;
    private String EmpDept;
    private int EmpSal;

    public Employee(int empid, String empName, String empDept, int empSal) {
        this.Empid = empid;
        this.EmpName = empName;
        this.EmpDept = empDept;
        this.EmpSal = empSal;
    }

    //getter and setter methods

    public Employee(){}

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpDept() {
        return EmpDept;
    }

    public void setEmpDept(String empDept) {
        EmpDept = empDept;
    }

    public int getEmpSal() {
        return EmpSal;
    }

    public void setEmpSal(int empSal) {
        EmpSal = empSal;
    }
}
