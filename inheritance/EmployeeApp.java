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
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee enda = new Employee("Enda", 33, "x1234",2000,24000);
        Employee anna = new Employee();
        anna.setName("Anna");
        
        Manager1 mom = new Manager1("Mom", 60, "x1231", 5000.00, 6000.00,"Finance");
        
        Manager liam = new Manager("HR","Liam", 64, "hr123",10000, 120000.00);
        
        Executive fiama = new Executive("me", "Owner", "Fiama", 26, "x111", 20000, 1000000);
        
        System.out.println("Employee Enda: " + enda.toString());
        System.out.println("Employee Anna: " + anna.toString());
        System.out.println("Employee Mom: " + mom.toString());
        System.out.println("Employee Liam: " + liam.toString());
        System.out.println("Employee Fiama: " + fiama.toString());
    }
    
}
