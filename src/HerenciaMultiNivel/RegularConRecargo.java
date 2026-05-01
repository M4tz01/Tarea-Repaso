package HerenciaMultiNivel;

public class RegularConRecargo extends EstudianteRegular {
    private double recargoPendiente;

    public void setRecargoPendiente(double recargoPendiente) {
        if (recargoPendiente >= 0) {
            this.recargoPendiente = recargoPendiente;
        } else {
            System.out.println("Recargo inválido");
        }
    }

    public double getRecargoPendiente() {
        return recargoPendiente;
    }

    @Override
    public double calcularPagoFinal() {
        return super.calcularPagoFinal() + recargoPendiente;
    }
}


