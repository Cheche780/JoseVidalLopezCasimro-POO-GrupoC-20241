
package javaapplication101;
import java.util.*;

public class main {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int con = 0, aux = 0;
        ArrayList<empleado> empleados = new ArrayList<>();
        

        do {
            System.out.println("ingrese el nombre del empleado");
            String nombreEmpleado = leer.nextLine();
            System.out.println("ingrese la edad: ");
            int edadEmpleado = leer.nextInt();
            System.out.println("ingrese el salario del empleado: ");
            double salarioEmpleado = leer.nextDouble();
            empleado empleado1 = new empleado(nombreEmpleado, edadEmpleado, salarioEmpleado);   
            System.out.println("Cuantas cuentas tendra este empleado: ");
            int cuentas = leer.nextInt();
            
            //for para añadir las cuentas del usuario
            for (int i = 0; i < cuentas; i++) {
                System.out.println("ingrese numero de cuenta:" );
                long numeroCuenta = leer.nextLong();
                System.out.println("seleccione tipo de cuenta A, B, C: ");
                char tipoCuenta = leer.next().charAt(0);
                leer.nextLine();
                //creamos un objeto nuevo para almacenar
                bankAccount newAccount = new bankAccount(tipoCuenta);
                newAccount.setTypeAccount(tipoCuenta);
                

            }
                empleados.add(empleado1);
            System.out.println("Agregar otro empleado? 1-Si, 2-No");
            con = leer.nextInt();
            
        } while (con==1);
        do {
                System.out.println("Seleccione un empleado:");
                for (int i = 0; i < empleados.size(); i++) {
                    System.out.println((i + 1) + ". " + empleados.get(i).getName());
                }
                int selected = leer.nextInt() - 1;
                leer.nextLine();
                empleado selectedEmployee = empleados.get(selected);

                System.out.println("Seleccione una cuenta:");
                for (int i = 0; i < selectedEmployee.getAccounts().size(); i++) {
                    bankAccount account = selectedEmployee.getAccounts().get(i);
                    System.out.println((i + 1) + ". Número de Cuenta: " + account.getAccountNumber() +
                            ", Tipo de Cuenta: " + account.getTypeAccount() + ", Saldo: $" + account.getAmount());
                }
                int accountSelected = leer.nextInt() - 1;
                leer.nextLine();
                bankAccount selectedAccount = selectedEmployee.getAccounts().get(accountSelected);

                System.out.println("¿Qué deseas hacer con la cuenta?");
                System.out.println("1.- Depositar ");
                System.out.println("2.- Retirar ");
                System.out.println("3.- Salir");
                con = leer.nextInt();
                leer.nextLine();
                switch (con) {
                    case 1:
                        selectedAccount.getMaxDeposit();
                        System.out.println("Nuevo Saldo: $" + selectedAccount.getAmount());
                        break;
                    case 2:
                        selectedAccount.getWithdraw();
                        System.out.println("Nuevo Saldo: $" + selectedAccount.getAmount());
                        break;
                    case 3:
                        System.out.println("Tenga buen dia");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }

                System.out.println("¿Desea realizar otra operación? \n1.- Sí  \n2.- No");
                aux = leer.nextInt();
                leer.nextLine();

                if (aux == 2) {
                    System.out.println("Tenga buen dia");
                }
            } while (aux == 1);
        
        
    }
}
