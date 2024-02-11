package domain;

import java.util.ArrayList;

public interface CuentaBancariaRepository {

        ArrayList<CuentaBancaria> obtainCuentasBancarias();
        CuentaBancaria obtainCuentaBancaria(String idCuenta);
        void deleteCuentaBancaria(String idCuenta);
        void saveCuentaBancaria(CuentaBancaria cuentaBancaria);
}