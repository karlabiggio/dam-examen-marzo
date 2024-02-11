package domain;

import java.util.ArrayList;

public class GetCuentaBancariaUseCase {
    private CuentaBancaria cuentaBancaria;
    private CuentaBancariaRepository cuentaBancariaRepository;

    public GetCuentaBancariaUseCase(CuentaBancariaRepository cuentaBancariaRepository) {
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public CuentaBancaria execute(String idCuenta) {
        return this.cuentaBancariaRepository.obtainCuentaBancaria(idCuenta);
    }
}