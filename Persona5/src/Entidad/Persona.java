//guia 9
package Entidad;

import java.util.Date;

public class Persona {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", fechaN=" + fechaN + '}';
    }
    
    private String name;
    private Date fechaN;

    public Persona() {
    }

    public Persona(String name, Date fechaN) {
        this.name = name;
        this.fechaN = fechaN;
    }
    
    
    
}
//Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
//constructor vacío, constructor parametrizado, get y set