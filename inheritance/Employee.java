/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author fiama
 */
public class Employee {
    private String name;
    private int age;
    private String empID;
    private double msalary;
    private double ysalary;

    public Employee(String name, int age, String empID, double msalary, double ysalary) {
        this.name = name;
        this.age = age;
        this.empID = empID;
        this.msalary = msalary;
        this.ysalary = ysalary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public double getMsalary() {
        return msalary;
    }

    public void setMsalary(double msalary) {
        this.msalary = msalary;
    }

    public double getYsalary() {
        return ysalary;
    }

    public void setYsalary(double ysalary) {
        this.ysalary = ysalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", empID=" + empID + ", msalary=" + msalary + ", ysalary=" + ysalary + '}';
    }
    
    
    
}
