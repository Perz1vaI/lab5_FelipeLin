package Lab5_FelipeLin;

import java.util.ArrayList;

public class Villanos {

    private ArrayList superpoderes = new ArrayList();
    private String nombre;
    private int edad;
    private String PlanetaOrigin;
    private double altura;
    private boolean carcel;
    private int muertos;

    public Villanos(String nombre, int edad, String PlanetaOrigin, double altura, boolean carcel, int muertos) {
        this.nombre = nombre;
        this.edad = edad;
        this.PlanetaOrigin = PlanetaOrigin;
        this.altura = altura;
        this.carcel = carcel;
        this.muertos = muertos;
    }

    public ArrayList getSuperpoderes() {
        return superpoderes;
    }

    public void setSuperpoderes(ArrayList superpoderes) {
        this.superpoderes = superpoderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPlanetaOrigin() {
        return PlanetaOrigin;
    }

    public void setPlanetaOrigin(String PlanetaOrigin) {
        this.PlanetaOrigin = PlanetaOrigin;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public int getMuertos() {
        return muertos;
    }

    public void setMuertos(int muertos) {
        this.muertos = muertos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
