package domain;

public class Cliente {
    private String idCliente;
    private String dni;
    private String nombre;
    private String apellidos;
    private String dirección;
    private String población;
    private String códigoPostal;

    public Cliente(String idCliente, String dni, String nombre, String apellidos, String dirección, String población, String códigoPostal) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirección = dirección;
        this.población = población;
        this.códigoPostal = códigoPostal;
    }
}

