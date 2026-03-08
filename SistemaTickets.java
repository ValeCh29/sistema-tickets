import java.util.PriorityQueue;
import java.util.Scanner;

public class SistemaTickets {

    static PriorityQueue<Ticket> cola = new PriorityQueue<>(
            (a,b) -> a.getId() - b.getId()
    );

    static ListaEnlazada resueltos = new ListaEnlazada();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\nSISTEMA DE TICKETS");
            System.out.println("1. Menu Usuario");
            System.out.println("2. Menu Administrador");
            System.out.println("3. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            if(opcion == 1){
                menuUsuario();
            }

            if(opcion == 2){
                menuAdmin();
            }

        } while(opcion != 3);
    }

    public static void menuUsuario(){

        System.out.println("\nMENU USUARIO");
        System.out.println("1. Crear Ticket");
        System.out.println("2. Buscar Ticket");
        System.out.println("3. Volver");

        int op = sc.nextInt();
        sc.nextLine();

        if(op == 1){
            crearTicket();
        }

        if(op == 2){
            buscarTicket();
        }
    }

    public static void menuAdmin(){

        System.out.println("\nMENU ADMIN");
        System.out.println("1. Ver Ticket al Frente");
        System.out.println("2. Resolver Ticket");
        System.out.println("3. Volver");

        int op = sc.nextInt();

        if(op == 1){
            verFrente();
        }

        if(op == 2){
            resolverTicket();
        }
    }

    public static void crearTicket(){

        System.out.println("Nombre completo:");
        String nombre = sc.nextLine();

        System.out.println("Descripcion:");
        String desc = sc.nextLine();

        Ticket t = new Ticket(desc, nombre);

        cola.add(t);

        System.out.println("Ticket creado con ID: " + t.getId());
    }

    public static void buscarTicket(){

        System.out.println("Ingrese ID:");
        int id = sc.nextInt();

        Ticket t = resueltos.buscar(id);

        if(t == null){
            System.out.println("El ticket esta pendiente.");
        }else{
            System.out.println(t);
        }
    }

    public static void verFrente(){

        Ticket t = cola.peek();

        if(t == null){
            System.out.println("No hay tickets.");
        }else{
            System.out.println(t);
        }
    }

    public static void resolverTicket(){

        Ticket t = cola.poll();

        if(t == null){
            System.out.println("No hay tickets.");
            return;
        }

        t.resolver();
        resueltos.agregar(t);

        System.out.println("Ticket resuelto.");
    }

    public static PriorityQueue<Ticket> getCola() {
        return cola;
    }

    public static ListaEnlazada getResueltos() {
        return resueltos;
    }

    public static Scanner getSc() {
        return sc;
    }
}