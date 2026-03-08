public class Nodo {

    Ticket ticket;
    Nodo siguiente;

    public Nodo(Ticket ticket) {
        this.ticket = ticket;
        this.siguiente = null;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}