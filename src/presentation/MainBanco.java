package presentation;

import data.CuentaBancariaDataRepository;
import domain.*;

import java.util.ArrayList;

public class MainBanco {
    public static void createHipoteca(String idCuenta, Hipoteca hipoteca) {
        GetCuentaBancariaUseCase getCuentaBancariaUseCase = new GetCuentaBancariaUseCase(CuentaBancariaDataRepository.newInstance());
        CuentaBancaria cuentaBancaria = getCuentaBancariaUseCase.execute(idCuenta);
        cuentaBancaria.addHipoteca(hipoteca);
        saveCuentaBancaria(cuentaBancaria);
    }

    public static void createTransaccion(String idCuenta, Transaccion transaccion) {
        GetCuentaBancariaUseCase getCuentaBancariaUseCase = new GetCuentaBancariaUseCase(CuentaBancariaDataRepository.newInstance());
        CuentaBancaria cuentaBancaria = getCuentaBancariaUseCase.execute(idCuenta);
        cuentaBancaria.addTransaccion(transaccion);
        saveCuentaBancaria(cuentaBancaria);
    }

    public static void saveCuentaBancaria(CuentaBancaria cuentaBancaria) {
        SaveCuentaBancariaUseCase saveCuentaBancariaUseCase = new SaveCuentaBancariaUseCase(CuentaBancariaDataRepository.newInstance());
        saveCuentaBancariaUseCase.execute(cuentaBancaria);
    }

    public static void deleteCuentaBancaria(String idCuenta) {
        DeleteCuentaBancariaUseCase deleteCuentaBancariaUseCase = new DeleteCuentaBancariaUseCase(CuentaBancariaDataRepository.newInstance());
        deleteCuentaBancariaUseCase.execute(idCuenta);
    }
    public static void printCuentaBancaria(String idCuenta) {
        GetCuentaBancariaUseCase getCuentaBancariaUseCase = new GetCuentaBancariaUseCase(CuentaBancariaDataRepository.newInstance());
        CuentaBancaria cuentaBancaria = getCuentaBancariaUseCase.execute(idCuenta);
        System.out.println(cuentaBancaria.toString());
    }

    public static void printCuentasBancarias() {
        GetCuentasBancariasUseCase getCuentasBancariasUseCase = new GetCuentasBancariasUseCase(CuentaBancariaDataRepository.newInstance());
        ArrayList<CuentaBancaria> cuentasBancarias = getCuentasBancariasUseCase.execute();
        System.out.println(cuentasBancarias.toString());
    }
}
