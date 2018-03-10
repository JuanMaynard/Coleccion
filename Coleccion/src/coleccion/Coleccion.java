package coleccion;

public abstract class Coleccion {

    protected String nombre;

    public Coleccion(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract int getDuracion();

    public abstract int getCantidad();

}
