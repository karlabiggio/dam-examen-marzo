package domain;

public class Hipoteca {
    private String idHipoteca;
    private String name;
    private String descripcion;
    private String fechaInicio;
    private String interes;
    private String fechaFin;
    private double importe;

    public Hipoteca(String idHipoteca, String name, String descripcion, String fechaInicio, String interes, String fechaFin, double importe) {
        this.idHipoteca = idHipoteca;
        this.name = name;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.interes = interes;
        this.fechaFin = fechaFin;
        this.importe = importe;
    }


    @Override
    public String toString() {
        return "Hipoteca{" +
                "idHipoteca='" + idHipoteca + '\'' +
                ", name='" + name + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", interes='" + interes + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", importe=" + importe +
                '}';
    }
}
