
package Entidad_Persona;

import java.util.Date;

public class Enti_Persona {
    
    private String nombre;
    private Date fechaNac;

    public Enti_Persona() {
    }

    public Enti_Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
}

//Implemente la clase Enti_Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
//constructor vacío, constructor parametrizado, get y set. 

