package org.example;

    public class Bibliotecario extends Usuario {
        
        private String turno;

protected Bibliotecario(String id, String nombre, String email, String turno) {
    super(id, nombre,email);
    this.turno = turno;
    }  
}