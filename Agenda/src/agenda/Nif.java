package agenda;

public class Nif {
    
    //Atributos
    private String dni;
    private char letra;

    //Constructor por defecto
    public Nif() {
    }

    //Constructor FULL
    public Nif(String dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    //MÉTODOS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    //TO_STRING
    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", letra=" + letra + '}';
    }
}
