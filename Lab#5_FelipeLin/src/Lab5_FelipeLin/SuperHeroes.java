package Lab5_FelipeLin;

import java.util.ArrayList;

public class SuperHeroes {

    private ArrayList superpoderes = new ArrayList();
    private String nombre;
    private int edad;
    private String PlanetaOrigin;
    private double altura;
    private int atrapados;

    public SuperHeroes() {
    }

    public SuperHeroes(String nombre, int edad, String PlanetaOrigin, double altura, int atrapados) {
        this.nombre = nombre;
        this.edad = edad;
        this.PlanetaOrigin = PlanetaOrigin;
        this.altura = altura;
        this.atrapados = atrapados;
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

    public int getAtrapados() {
        return atrapados;
    }

    public void setAtrapados(int atrapados) {
        this.atrapados = atrapados;
    }

    @Override
    public String toString() {
        return nombre;

    }

}
