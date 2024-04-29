package coleccionesI;

//Ejercicio22

import java.util.ArrayList;
import java.util.List;

class CuentaCorriente {
    private static int contadorCuentas = 0;
    private int numeroCuenta;
    private double saldo;
    private List<Movimiento> movimientos;

    public CuentaCorriente() {
        this.numeroCuenta = ++contadorCuentas;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public CuentaCorriente(double saldoInicial) {
        this.numeroCuenta = ++contadorCuentas;
        this.saldo = saldoInicial;
        this.movimientos = new ArrayList<>();
    }

    public void ingreso(double cantidad) {
        saldo += cantidad;
        movimientos.add(new Movimiento("Ingreso", cantidad));
    }

    public void cargo(double cantidad) {
        saldo -= cantidad;
        movimientos.add(new Movimiento("Cargo", cantidad));
    }

    public void transferencia(CuentaCorriente destino, double cantidad) {
        saldo -= cantidad;
        destino.ingreso(cantidad);
        movimientos.add(new Movimiento("Transf. emitida de " + cantidad + " € a la cuenta " + destino.numeroCuenta, cantidad));
    }

    public void movimientos() {
        System.out.println("Movimientos de la cuenta " + numeroCuenta);
        System.out.println("-----------------------------------");
        for (Movimiento movimiento : movimientos) {
            System.out.println(movimiento + " Saldo: " + saldo + " €");
        }
    }
}
