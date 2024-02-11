package domain;

import java.util.ArrayList;

public class CuentaBancaria {

    private Hipoteca hipoteca;
    private String idCuenta;
    private String numeroCuenta;
    private Cliente cliente;
    private ArrayList<Transaccion> transacciones;
    private String productosContratados;
    private double saldo;

    public CuentaBancaria(String idCuenta, String numeroCuenta, Cliente cliente, String productosContratados, double saldo) {
        this.idCuenta = idCuenta;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.transacciones = new ArrayList<Transaccion>();
        this.productosContratados = productosContratados;
        this.saldo = saldo;
        this.hipoteca = null;
    }

    public void addTransaccion(Transaccion transaccion) {
        saldo += transaccion.getImporte();
        transacciones.add(transaccion);
    }

    public void addHipoteca(Hipoteca nuevaHipoteca) {
        hipoteca = nuevaHipoteca;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "hipoteca=" + hipoteca +
                ", idCuenta='" + idCuenta + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", cliente=" + cliente +
                ", transacciones=" + transacciones +
                ", productosContratados='" + productosContratados + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
