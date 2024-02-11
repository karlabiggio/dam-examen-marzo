package domain;

public class SaveCuentaBancariaUseCase {
    private CuentaBancariaRepository cuentaBancariaRepository;

    public SaveCuentaBancariaUseCase(CuentaBancariaRepository cuentaBancariaRepository){
        this.cuentaBancariaRepository = cuentaBancariaRepository;
    }

    public void execute(CuentaBancaria cuentaBancaria){
        this.cuentaBancariaRepository.saveCuentaBancaria(cuentaBancaria);
    }

}
