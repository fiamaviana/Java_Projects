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
public class Executive extends Manager{
    private String owner;

    public Executive(String owner, String dept) {
        super(dept);
        this.owner = owner;
    }

    public Executive(String owner, String dept, String name, int age, String empID, double msalary, double ysalary) {
        super(dept, name, age, empID, msalary, ysalary);
        this.owner = owner;
    }

    public Executive(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Executive{" + "owner=" + owner + '}';
    }
    
    
}
