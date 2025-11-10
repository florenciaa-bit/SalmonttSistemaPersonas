package model;

public class Empleado extends Persona {


    private String cargo;
    private String area;
    private double sueldoMensual;
    private boolean activo;


    public Empleado() {
        // llama al constructor por defecto de Persona
        super();
        this.cargo = "Sin cargo";
        this.area = "Sin área";
        this.sueldoMensual = 0.0;
        this.activo = true;
    }


    public Empleado(String rut,
                    String nombreCompleto,
                    String email,
                    String telefono,
                    Direccion direccion,
                    String cargo,
                    String area,
                    double sueldoMensual,
                    boolean activo) {

        super(rut, nombreCompleto, email, telefono, direccion); // datos de Persona
        this.cargo = cargo;
        this.area = area;
        this.sueldoMensual = sueldoMensual;
        this.activo = activo;
    }

    // Getters y setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "\n  " + super.toString() + // imprime los datos de Persona
                "  Cargo: " + cargo +
                "\n  Área: " + area +
                "\n  Sueldo mensual: $" + sueldoMensual +
                "\n  Activo: " + (activo ? "Sí" : "No") +
                "\n}";
    }
}
