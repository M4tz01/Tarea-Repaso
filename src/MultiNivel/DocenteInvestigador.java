package MultiNivel;

public class DocenteInvestigador extends Docente {
    private int publicaciones;

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        } else {
            System.out.println("Publicaciones inválidas");
        }
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    @Override
    public double calcularPago() {
        double pagoBase = super.calcularPago();
        double bono = publicaciones * 20;
        return pagoBase + bono;
    }

    // SOBRECARGA
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con producción académica.");
    }
}