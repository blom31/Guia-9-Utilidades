
package Service;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena leerFrase() {

        Cadena frase = new Cadena();

        System.out.println("**____________________________**");
        System.out.println("  Método para Leer Frase ");

        System.out.print("ingrese una frase:  ");
        frase.setFrase(leer.nextLine());
        frase.setLongitud(frase.getFrase().length());
        return frase;

    }

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.*/
    public void contarVocales(Cadena frase) {
        int contvocal = 0;

        System.out.println("____________________________");
        System.out.println("** Método para Contar vocales en la frase **");

        for (int i = 0; i < frase.getLongitud(); i++) {
            if ((frase.getFrase().charAt(i) == 'a')
                    || (frase.getFrase().charAt(i) == 'e')
                    || (frase.getFrase().charAt(i) == 'i')
                    || (frase.getFrase().charAt(i) == 'o')
                    || (frase.getFrase().charAt(i) == 'u')) {
                contvocal++;
            }

        }
        System.out.println("La cantidad de vocales en la frase es; " + contvocal);

    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
    //Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void fraseInvertida(Cadena frase) {

        String invertida = "";

        System.out.println("_________________________________");
        System.out.println("**  Método para invertir la frase  **");

        for (int i = frase.getLongitud() - 1; i >= 0; i--) {

            invertida += frase.getFrase().charAt(i);
        }

        System.out.println("La frase invertida es " + invertida);
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
        contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(Cadena frase) {
        int contletra = 0;

        System.out.println("________________________________________________________");
        System.out.println("**  Método para contar cuantas veces aparece un carácter  **");

        System.out.println(" Ingrese el caracter a buscar");
        char letra = leer.next().charAt(0);

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i) == letra) {
                contletra++;

            }
        }
        System.out.println("La cantidad de veces que se repite la letra " + letra + " es " + contletra);
    }

    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
    con otra nueva frase ingresada por el usuario.*/
    public void compararLogitud(Cadena frase) {

        String newfrase = "";

        System.out.println("____________________________________________________");
        System.out.println("**  Método para Comparar la logitud entre dos frases  **");

        System.out.println("Ingrese una una frase para comparar su longitud");
        newfrase = leer.next();

        if (frase.getLongitud() == newfrase.length()) {
            System.out.println(" Las frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }
    }
    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada 
por el usuario y mostrar la frase resultante.*/
    
    public void unirFrase (Cadena frase){
        
        String newfrase="";
        
         System.out.println("____________________________________________________");
        System.out.println("**  Método para Comparar unir dos frases  **");
        
        System.out.println("Ingrese una frase");
        newfrase = leer.next();
        
        System.out.println(frase.getFrase()+ " + " + newfrase);
        
    }
/*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.*/
    
    public void reemplazar(Cadena frase){
        
        String caracter="";
        
         System.out.println("____________________________________________________");
        System.out.println("**  Método para Reemplazar la letra a  **");
        
        System.out.print("Ingrese el carácter que reemplazará la letra a ");
        caracter=leer.next();
        System.out.println(frase.getFrase().replaceAll("a", caracter));
        
    }
    
    /*Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero
si la contiene y falso si no.*/
    
    public void contiene (Cadena frase){
        
        String letra="";
        System.out.println("____________________________________________________");
        System.out.println("**  Método para saber si la frase contiene una letra ingresada por el usuario  **");
        
        System.out.print("Ingrese una letra ");
        letra=leer.next();
        System.out.println(frase.getFrase().contains(letra));
    }


}
