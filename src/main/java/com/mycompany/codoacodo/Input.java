package com.mycompany.codoacodo;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Input {

    public void recibirInputs() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, hobbie, editor, sistemaOperativo;
        Usuario usuario;

        int edad;
        edad = 0;
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        while (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio!");
            nombre = sc.nextLine();
        }
        System.out.println("Ingrese apellido: ");
        apellido = sc.nextLine();
        while (apellido.isEmpty()) {
            System.out.println("El apellido no puede estar vacio!");
            apellido = sc.nextLine();
        }
        System.out.println("Ingrese edad: ");
        edad = Integer.valueOf(sc.nextLine());
        while (edad == 0) {
            System.out.println("La edad no puede estar vacia!");
            edad = Integer.valueOf(sc.nextLine());
        }
        System.out.println("Ingrese hobbie: ");
        hobbie = sc.nextLine();
        while (hobbie.isEmpty()) {
            System.out.println("El hobbie no puede estar vacio!");
            hobbie = sc.nextLine();
        }
        System.out.println("Ingrese editor: ");
        editor = sc.nextLine();
        while (editor.isEmpty()) {
            System.out.println("El editor no puede estar vacio!");
            editor = sc.nextLine();
        }
        System.out.println("Ingrese sistema operativo: ");
        sistemaOperativo = sc.nextLine();
        while (sistemaOperativo.isEmpty()) {
            System.out.println("El sistema operativo no puede estar vacio!");
            sistemaOperativo = sc.nextLine();
        }
        
        usuario = new Usuario(nombre, apellido, hobbie, editor, sistemaOperativo, edad);
        imprimirUsuario(usuario);
    }
    public void imprimirUsuario(Usuario usuario){
        System.out.println(usuario);
    }
}
