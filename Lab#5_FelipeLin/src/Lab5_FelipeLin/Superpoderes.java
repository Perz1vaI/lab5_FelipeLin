package Lab5_FelipeLin;

public class Superpoderes {

    private int poder;
    private String descripcion;
    private boolean mortal;

    public Superpoderes() {
    }

    public Superpoderes(int poder, String descripcion, boolean mortal) {
        this.poder = poder;
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    @Override
    public String toString() {
        return "Superpoderes{" + "poder=" + poder + ", descripcion=" + descripcion + ", mortal=" + mortal + '}';
    }

}
