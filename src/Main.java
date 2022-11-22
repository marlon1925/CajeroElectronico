import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Cajero bank = new Cajero();

        System.out.println("BIENVENIDO");
        System.out.println("Por favor ingrese su tarjeta");
        System.out.println("PROCESANDO......");
        System.out.println("PROCESANDO......");
        System.out.println("PROCESANDO......");
        System.out.println("PROCESANDO......");
        do {
            op = bank.menu();
            switch (op){
                case 1:
                    System.out.println("===== DEPOSITO =====\n");
                    System.out.print("SALDO DISPONIBLE:" + bank.getSaldoDis() + "\n");

                    System.out.print("Ingresa el numero de cuenta: ");
                    bank.cuenta = sc.nextLine();
                    bank.setCuenta(bank.cuenta);
                    System.out.print("Ingrese su numero de cedula: ");
                    bank.cedula = sc.nextLine();
                    bank.setCedula(bank.cedula);
                    do {
                        System.out.print("Ingrese el monto a depositar: ");
                        bank.monto = sc.nextInt();
                        bank.setMonto(bank.monto);
                    }while(bank.monto < 0);

                    bank.defectoD();
                    break;
                case 2:
                    System.out.println("===== RETIRO =====");
                    System.out.print("SALDO DISPONIBLE:" + bank.getSaldoDis() + "\n");
                    do {
                        System.out.print("Ingresa el monto que a retirar: ");
                        bank.monto = sc.nextInt();
                        bank.setMonto(bank.monto);
                    }while(bank.monto < 0);
                    bank.defectoR();

                    break;
            }
        }while(op!=0);

    }
}