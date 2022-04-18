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
public class Manager extends Employee{
    private String dept;
    
    public Manager(String dept){
        this.dept = dept;
    }

    public Manager(String dept, String name, int age, String empID, double msalary, double ysalary) {
        super(name, age, empID, msalary, ysalary);
        this.dept = dept;
    }

    public Manager() {
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Manager{" + "dept=" + dept + '}' + super.toString();
    }
         
}
