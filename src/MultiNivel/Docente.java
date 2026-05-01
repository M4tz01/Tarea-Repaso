package MultiNivel;

public class Docente extends PersonaAcademica {
    private int horasClase;
    private double valorHora;

    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        } else {
            System.out.println("Horas inválidas");
        }
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public int getHorasClase() {
        return horasClase;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente");
    }
}
