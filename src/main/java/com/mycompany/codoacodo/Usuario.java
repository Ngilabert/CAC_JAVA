package com.mycompany.codoacodo;

/**
 *
 * @author nicol
 */
public class Usuario {
    String nombre,apellido,hobbie,editor,sistemaOperativo;
    int edad;

    public Usuario(String nombre, String apellido, String hobbie, String editor, String sistemaOperativo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hobbie = hobbie;
        this.editor = editor;
        this.sistemaOperativo = sistemaOperativo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "\nnombre=" + nombre + ", \napellido=" + apellido + ", \nhobbie=" + hobbie + ", \neditor=" + editor + ", \nSistema operativo=" + sistemaOperativo + ", \nedad=" + edad + '}';
    }
    
}
