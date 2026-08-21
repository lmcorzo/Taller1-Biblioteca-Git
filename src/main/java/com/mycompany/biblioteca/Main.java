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
