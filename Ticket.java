import java.time.LocalDateTime;

public class Ticket {

    static int cantidad = 0;

    int id;
    String descripcion;
    String nombreCompleto;
    LocalDateTime fechaCreacion;
    LocalDateTime fechaResolucion;

    /**
     * @param descripcion
     * @param nombreCompleto
     */
    public Ticket(String descripcion, String nombreCompleto) {

        this.id = ++cantidad;
        this.descripcion = descripcion;
        this.nombreCompleto = nombreCompleto;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaResolucion = null;
    }

    public void resolver() {
        this.fechaResolucion = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String toString() {

        return "ID: " + id +
                "\nUsuario: " + nombreCompleto +
                "\nDescripcion: " + descripcion +
                "\nFecha Creacion: " + fechaCreacion +
                "\nFecha Resolucion: " + fechaResolucion;
    }
}