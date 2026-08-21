/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

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