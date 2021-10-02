import Persona.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();

        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println("Escribe tu apellido: ");
        p.setApellido(sc.nextLine());
        System.out.println("Escribe tu DNI: ");
        p.setDNI_SL(Integer.parseInt(sc.nextLine()));
        System.out.println("Escribe tu edad: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));


        System.out.println("Buenos dias : "+ p.getNombre() + " " + p.getApellido() + " con DNI: " + p.getDNI_SL() + " y " + p.getEdad() + " años ");
    }
  }
