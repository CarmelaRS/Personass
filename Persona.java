package Persona;

public class Persona {

    private String Nombre;
    private String Apellido;
    private int DNI_SL;
    private int edad;


    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDNI_SL() {
        return DNI_SL;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setDNI_SL(int DNI_SL) {
        this.DNI_SL = DNI_SL;
    }

    public void setEdad(int edad) {
        if(edad >= 18){

            System.out.println("Estas hecho un chaval");
        }else {
            System.out.println("Ya eres talludito");
        }
        this.edad = edad;
    }

}
