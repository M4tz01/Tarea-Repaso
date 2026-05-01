package HerenciaMultiNivel;

public class EstudianteRegular extends Estudiante {
    private int numeroMaterias;

    public void setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias > 0) {
            this.numeroMaterias = numeroMaterias;
        } else {
            System.out.println("Número inválido");
        }
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (numeroMaterias * 10);
    }
}
