package HerenciaMultiNivel;

public class BecadoExcelencia extends EstudianteBecado {
    private double bonoExcelencia;

    public void setBonoExcelencia(double bonoExcelencia) {
        this.bonoExcelencia = bonoExcelencia;
    }

    public double getBonoExcelencia() {
        return bonoExcelencia;
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        return Math.max(pago, 0); // no negativo
    }
}
