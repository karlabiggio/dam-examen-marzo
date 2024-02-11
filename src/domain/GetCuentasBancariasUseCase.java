package domain;

import java.util.ArrayList;

public class GetCuentasBancariasUseCase {
    private CuentaBancariaRepository cuentaBancariaRepository;

    public GetCuentasBancariasUseCase(CuentaBancariaRepository cuentaBancariaRepository) {
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public ArrayList<CuentaBancaria> execute() {
        return cuentaBancariaRepository.obtainCuentasBancarias();
    }
}
