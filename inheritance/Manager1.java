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
public class Manager1 {
    private String name;
    private int age;
    private String empId;
    private double mSalary;
    private double YSalary;
    private String dept;

    public Manager1(String name, int age, String empId, double mSalary, double YSalary, String dept) {
        this.name = name;
        this.age = age;
        this.empId = empId;
        this.mSalary = mSalary;
        this.YSalary = YSalary;
        this.dept = dept;
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

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getmSalary() {
        return mSalary;
    }

    public void setmSalary(double mSalary) {
        this.mSalary = mSalary;
    }

    public double getYSalary() {
        return YSalary;
    }

    public void setYSalary(double YSalary) {
        this.YSalary = YSalary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Manager1{" + "name=" + name + ", age=" + age + ", empId=" + empId + ", mSalary=" + mSalary + ", YSalary=" + YSalary + ", dept=" + dept + '}';
    }
    
    
    
}


