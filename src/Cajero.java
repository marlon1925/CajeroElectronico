import java.util.Scanner;

public class Cajero {
    Scanner sc = new Scanner(System.in);
    //atributos

    String cuenta;
    int monto;
    String cedula;
    int saldoDis;

    public Cajero(){
        cuenta="1234567890";
        monto = 0;
        cedula="1234567890";
        saldoDis = 100;
    }

    public void defectoD(){
        System.out.println("Se a realizado con exito!!!!");
        System.out.println("");
        System.out.println("Cuenta: " + getCuenta());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Monto: " + getMonto());
        System.out.println("Saldo actual: " + (getSaldoDis()+getMonto()));
    }

    public void defectoR(){
        System.out.println("Se a realizado con exito!!!!");
        System.out.println("");
        System.out.println("El monto que retiraste es: " + getMonto());
        System.out.println("Saldo actual: " + (getSaldoDis()-getMonto()));

    }
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getSaldoDis() {
        return saldoDis;
    }

    public void setSaldoDis(int saldoDis) {
        this.saldoDis = saldoDis;
    }

    public int menu(){
        int op=0;
        do {
            System.out.println(" ======== CAJERO ELECTRONICO ========");
            System.out.println("| 1. Deposito                        |");
            System.out.println("| 2. Retiro                          |");
            System.out.println("| 0. Salir                           |");
            System.out.println(" ====================================");
            System.out.print("Opcion: ");
            op = sc.nextInt();
        }while(op < 0 || op > 3);

        return op;
    }
}



