public class ListaEnlazada {

    Nodo cabeza;

    public void agregar(Ticket ticket) {

        Nodo nuevo = new Nodo(ticket);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public Ticket buscar(int id) {

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.ticket.getId() == id) {
                return actual.ticket;
            }

            actual = actual.siguiente;
        }

        return null;
    }
}