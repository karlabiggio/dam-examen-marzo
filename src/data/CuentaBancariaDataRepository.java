package data;

import domain.CuentaBancaria;
import domain.CuentaBancariaRepository;

import java.util.ArrayList;

public class CuentaBancariaDataRepository implements CuentaBancariaRepository {
    private final ArrayList<CuentaBancaria> cuentasBancarias;

    public static CuentaBancariaRepository instance = null;

    public CuentaBancariaDataRepository() {
        this.cuentasBancarias = new ArrayList<>();
    }

    public static CuentaBancariaRepository newInstance() {
        if (instance == null) {
            instance = new CuentaBancariaDataRepository();
        }

        return instance;
    }

    @Override
    public ArrayList<CuentaBancaria> obtainCuentasBancarias() {
        return cuentasBancarias;
    }

    @Override
    public CuentaBancaria obtainCuentaBancaria(String idCuenta) {
        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            if (cuentaBancaria.getIdCuenta().equals(idCuenta)) {
                return cuentaBancaria;
            }
        }

        return null;
    }

    @Override
    public void deleteCuentaBancaria(String idCuenta) {
        for (int i = 0; i < cuentasBancarias.size(); i++) {
            if (cuentasBancarias.get(i).getIdCuenta().equals(idCuenta)) {
                cuentasBancarias.remove(i);
            }
        }
    }

    @Override
    public void saveCuentaBancaria(CuentaBancaria cuentaBancaria) {
        CuentaBancaria cuenta = obtainCuentaBancaria(cuentaBancaria.getIdCuenta());
        if (cuenta != null) {
            deleteCuentaBancaria(cuentaBancaria.getIdCuenta());
        }

        cuentasBancarias.add(cuentaBancaria);
    }
}
