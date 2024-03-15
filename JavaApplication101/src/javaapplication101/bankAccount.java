package javaapplication101;
import java.util.*;

public class bankAccount {
    Scanner leer = new Scanner (System.in);
    
   long accountNumber;
           double amount = 0;
   private char typeAccount;
   private double cash;
   private double maxDeposit;
   private double withdraw;
   
   private int depositoMax_A = 50000;
   private int depositoMax_B = 100000;
   private int minimoCuenta_A = 1000;
   private int minimoCuenta_B = 5000;
   private int minimoCuenta_C = 10000;
   
   public bankAccount(long accountNumber){
    this.accountNumber = accountNumber;
        
} 

    public double getMaxDeposit() {
        return maxDeposit;
    }

    public void setMaxDeposit(double maxDeposit) {
        this.maxDeposit = maxDeposit;
        System.out.println("seleccione tipo de cuenta (A,B,C): ");
        char type = leer.next().charAt(0);
        System.out.println("ingrese cantidad a depositar: ");
         double deposit = leer.nextDouble();
        switch (type){
            case 'A':
                if (deposit <= depositoMax_A ) {
                    amount = amount + deposit;
                    System.out.println("usted a ingresado $"+deposit);
                }else{
                    System.out.println("su cuenta no puede superar el limite.");
                }
                return;
                
            case 'B':
                if (deposit <= depositoMax_B) {
                    amount = amount + deposit;
                    System.out.println("usted ah ingresado $"+deposit);
                }else {
                    System.out.println("su cuenta no puede superar el limite");
                }
                return;
            case 'C':
                amount = amount+ deposit;
                System.out.println("usted ah ingresado $"+deposit);
                return;
            default:
        }       
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
        System.out.println("seleccione tipo de cuenta (A,B,C): ");
        char type = leer.next().charAt(0);
        System.out.println("ingrese cantidad a retirar: ");
         double withdraw1 = leer.nextDouble();
        switch (type){
            case 'A':
                if (withdraw1 >= minimoCuenta_A ) {
                    amount = amount - withdraw1;
                    System.out.println("usted a retirado $"+withdraw1);
                }else{
                    System.out.println("su cuenta no puede tener menos dinero que "+minimoCuenta_A);
                }
                return;
                
            case 'B':
                if (withdraw1 >= minimoCuenta_B ) {
                    amount = amount - withdraw1;
                    System.out.println("usted a retirado $"+withdraw1);
                }else{
                    System.out.println("su cuenta no puede tener menos dinero que "+minimoCuenta_B);
                }
                return;
            case 'C':
                amount = amount - withdraw1;
                System.out.println("usted ah ingresado $"+withdraw1);
                return;
            default:
        }       
    }
   
 
   
   
  
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public char getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(char typeAccount) {
        this.typeAccount = typeAccount;
    }

    

    public String getaccountInfo(){
        return "numero de cuenta "+accountNumber + ", tipo de cuenta "+typeAccount+ ", saldo disponible "+amount;
    }
                  
        
    

   
   
   
}
