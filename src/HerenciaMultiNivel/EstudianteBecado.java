package HerenciaMultiNivel;

public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        } else {
            System.out.println("Beca inválida");
        }
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    @Override
    public double calcularPagoFinal() {
        double descuento = getValorMatricula() * (porcentajeBeca / 100);
        return getValorMatricula() - descuento;
    }
}

