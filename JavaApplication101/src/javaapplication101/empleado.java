
package javaapplication101;

import java.util.*;

public class empleado {

    
   private String name;
   private int age;
   private double salary;
   private long accountNumber;
    
    private List<bankAccount> accounts;

    public empleado(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.accounts = new ArrayList<>();
    }

    public List<bankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(bankAccount account) {
        this.accounts.add(account);
    }
   
   
   //getter and setter name 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// getters and setters age
    public int getAge() {
        
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        }else {
            System.out.println("invalid age");
        }
        
    }
// getters and setters salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0 ) {
            this.salary = salary;
            
        }else {
            System.out.println("invalid salary");
        }
    }

   


    public String getData(){
                return String.format("Nombre: ", this.getName());
    }
public String getempleadoInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(name).append("\n");
        info.append("Edad: ").append(age).append("\n");
        info.append("Salario: ").append(salary).append("\n");
        info.append("Cuentas bancarias:\n");
        for (bankAccount account : accounts) {
            info.append(account.getaccountInfo()).append("\n");
        }
        return info.toString();
}
    
   
   
}
