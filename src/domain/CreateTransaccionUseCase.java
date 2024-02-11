package domain;

public class CreateTransaccionUseCase {
    private CuentaBancariaRepository cuentaBancariaRepository;

    public CreateTransaccionUseCase(CuentaBancariaRepository cuentaBancariaRepository) {
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public void execute(Transaccion transaccion, String idCuenta) {
        CuentaBancaria cuenta = cuentaBancariaRepository.obtainCuentaBancaria(idCuenta);
        cuenta.addTransaccion(transaccion);
        this.cuentaBancariaRepository.saveCuentaBancaria(cuenta);
    }
}
