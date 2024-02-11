import domain.Cliente;
import domain.CuentaBancaria;
import domain.Hipoteca;
import domain.Transaccion;
import presentation.MainBanco;

public class Main {
    public static void main(String[] args) {
        MainBanco.saveCuentaBancaria(new CuentaBancaria(
                "1",
                "123456",
                new Cliente("1",
                        "9082665P",
                        "Karla",
                        "Vergara",
                        "Calle Soria",
                        "Avila",
                        "05003"),
                "2",
                80.8
                ));
        MainBanco.saveCuentaBancaria(new CuentaBancaria(
                "2",
                "654321",
                new Cliente("2",
                        "908237836X",
                        "Napoleon",
                        "Bonaparte",
                        "Calle Francia",
                        "Paris",
                        "05001"),
                "3",
                40.2
        ));
        MainBanco.saveCuentaBancaria(new CuentaBancaria(
                "3",
                "654654",
                new Cliente("3",
                        "90724573P",
                        "Blanca",
                        "Biggio",
                        "Calle San Juan",
                        "Avila",
                        "05003"),
                "4",
                40.2
        ));
        MainBanco.printCuentasBancarias();
        MainBanco.deleteCuentaBancaria("2");

        MainBanco.createTransaccion("1", new Transaccion("1", "cobro", -20));
        MainBanco.printCuentaBancaria("1");

        MainBanco.createTransaccion("1", new Transaccion("2", "pago", 30));
        MainBanco.printCuentaBancaria("1");

        MainBanco.createHipoteca("3", new Hipoteca("1", "Calle San Juan 4B",
                "casa con terraza","11/02/2024","", "11/02/2034", 25.000));
        MainBanco.printCuentaBancaria("3");
    }
}