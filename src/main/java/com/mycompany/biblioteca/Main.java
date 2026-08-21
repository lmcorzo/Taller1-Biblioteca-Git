/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
static ArrayList<Libro> libros = new ArrayList<>();
static ArrayList<Prestamo> prestamos = new ArrayList<>();
    public static void main(String[] args) {
        // Aquí irá el menú (Fase 8)
    }
}

public static void crearCliente() {

    System.out.println("=== REGISTRAR CLIENTE ===");

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Documento: ");
    String documento = sc.nextLine();

    System.out.print("Teléfono: ");
    String telefono = sc.nextLine();

    System.out.print("Código del cliente: ");
    String codigoCliente = sc.nextLine();

    Cliente cliente = new Cliente(
            nombre,
            documento,
            telefono,
            codigoCliente
    );

    Clientes.add(cliente);

    System.out.println("Cliente creado correctamente.");
}

// ==================== READ ====================

// Listar clientes
public static void listarClientes() {
    if (clientes.isEmpty()) {
        System.out.println("No hay clientes registrados.");
        return;
    }

    System.out.println("\n===== LISTA DE CLIENTES =====");

    for (Cliente cliente : clientes) {
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Correo: " + cliente.getCorreo());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("-----------------------------");
    }
}

// Buscar cliente
public static void buscarCliente(int id) {
    for (Cliente cliente : clientes) {
        if (cliente.getId() == id) {
            System.out.println("\n===== CLIENTE ENCONTRADO =====");
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Correo: " + cliente.getCorreo());
            System.out.println("Teléfono: " + cliente.getTelefono());
            return;
        }
    }

    System.out.println("No se encontró ningún cliente con el ID: " + id);
}

// UPDATE - Actualizar cliente
public static void actualizarCliente(int id, String nombre, String correo, String telefono) {
    for (Cliente cliente : clientes) {
        if (cliente.getId() == id) {
            cliente.setNombre(nombre);
            cliente.setCorreo(correo);
            cliente.setTelefono(telefono);

            System.out.println("Cliente actualizado correctamente.");
            return;
        }
    }

    System.out.println("No se encontró ningún cliente con el ID: " + id);
}

// DELETE - Eliminar cliente
public static void eliminarCliente(int id) {
    for (Cliente cliente : clientes) {
        if (cliente.getId() == id) {
            clientes.remove(cliente);
            System.out.println("Cliente eliminado correctamente.");
            return;
        }
    }

    System.out.println("No se encontró ningún cliente con el ID: " + id);
}
public static void crearLibro(int id, String nombre, String descripcion,
                              int cantidad, String autor, String editorial,
                              int numeroPaginas) {

    Libro libro = new Libro(
            id,
            nombre,
            descripcion,
            cantidad,
            autor,
            editorial,
            numeroPaginas
    );

    libros.add(libro);

    System.out.println("Libro creado correctamente.");
}
public static void listarLibros() {

    if (libros.isEmpty()) {
        System.out.println("No hay libros registrados.");
        return;
    }

    System.out.println("\n===== LISTA DE LIBROS =====");

    for (Libro libro : libros) {
        System.out.println("ID: " + libro.getId());
        System.out.println("Nombre: " + libro.getNombre());
        System.out.println("Descripción: " + libro.getDescripcion());
        System.out.println("Cantidad: " + libro.getCantidad());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Editorial: " + libro.getEditorial());
        System.out.println("Número de páginas: " + libro.getNumeroPaginas());
        System.out.println("-----------------------------");
    }
}
public static void buscarLibro(int codigo) {

    for (Libro libro : libros) {

        if (libro.getId() == codigo) {

            System.out.println("\n===== LIBRO ENCONTRADO =====");
            System.out.println("ID: " + libro.getId());
            System.out.println("Nombre: " + libro.getNombre());
            System.out.println("Descripción: " + libro.getDescripcion());
            System.out.println("Cantidad: " + libro.getCantidad());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Editorial: " + libro.getEditorial());
            System.out.println("Número de páginas: " + libro.getNumeroPaginas());

            return;
        }
    }

    System.out.println("No se encontró ningún libro con el código: " + codigo);
}
public static void actualizarLibro(int id, String nombre, String descripcion,
                                   int cantidad, String autor, String editorial,
                                   int numeroPaginas) {

    for (Libro libro : libros) {

        if (libro.getId() == id) {

            libro.setNombre(nombre);
            libro.setDescripcion(descripcion);
            libro.setCantidad(cantidad);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setNumeroPaginas(numeroPaginas);

            System.out.println("Libro actualizado correctamente.");
            return;
        }
    }

    System.out.println("No se encontró ningún libro con el ID: " + id);
}
public static void eliminarLibro(int id) {

    for (Libro libro : libros) {

        if (libro.getId() == id) {

            libros.remove(libro);

            System.out.println("Libro eliminado correctamente.");
            return;
        }
    }

    System.out.println("No se encontró ningún libro con el ID: " + id);
}

public static void crearPrestamo(int id, Cliente cliente, Libro libro,
                                 String fechaPrestamo, String fechaDevolucion) {

    Prestamo prestamo = new Prestamo(
            id,
            cliente,
            libro,
            fechaPrestamo,
            fechaDevolucion
    );

    prestamos.add(prestamo);

    System.out.println("Préstamo registrado correctamente.");
}
public static void devolucion(int id, String fechaDevolucion) {

    for (Prestamo prestamo : prestamos) {

        if (prestamo.getId() == id) {

            prestamo.setFechaDevolucion(fechaDevolucion);

            System.out.println("Libro devuelto correctamente.");
            return;
        }
    }

    System.out.println("No se encontró ningún préstamo con el ID: " + id);
}