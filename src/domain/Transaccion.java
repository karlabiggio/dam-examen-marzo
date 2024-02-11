package domain;

public class Transaccion {
    private String idTransaccion;
    private String descripcion;
    private double importe;

    public Transaccion(String idTransaccion, String descripcion, double importe) {
        this.idTransaccion = idTransaccion;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "idTransaccion='" + idTransaccion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", importe=" + importe +
                '}';
    }
}
