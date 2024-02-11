package domain;

public class DeleteCuentaBancariaUseCase {
    private CuentaBancariaRepository cuentaBancariaRepository;

    public DeleteCuentaBancariaUseCase(CuentaBancariaRepository cuentaBancariaRepository) {
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public void execute(String idCuenta) {
        cuentaBancariaRepository.deleteCuentaBancaria(idCuenta);
    }
}
