# Sistema de Gestión de Tickets

Proyecto desarrollado en Java que simula un sistema de gestión de tickets utilizando una interfaz de línea de comandos (CLI).

## Funcionalidades

### Usuario

* Crear tickets
* Buscar tickets resueltos por ID

### Administrador

* Ver el ticket al frente de la cola
* Resolver tickets

## Estructuras de datos utilizadas

* **Cola de prioridad**: almacena los tickets pendientes.
* **Lista enlazada simple**: almacena los tickets resueltos.

## Archivos del proyecto

* `Ticket.java` → Clase que representa un ticket
* `Nodo.java` → Nodo utilizado en la lista enlazada
* `ListaEnlazada.java` → Implementación de la lista enlazada
* `SistemaTickets.java` → Programa principal con el menú del sistema

## Cómo ejecutar

Compilar:

```
javac *.java
```

Ejecutar:

```
java SistemaTickets
```
