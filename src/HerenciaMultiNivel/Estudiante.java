package HerenciaMultiNivel;
//PADRE
public class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    // SETTERS con validación
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            System.out.println("Código inválido");
        } else {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Nombre inválido");
        } else {
            this.nombre = nombre;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido");
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula > 0) {
            this.valorMatricula = valorMatricula;
        } else {
            System.out.println("Valor inválido");
        }
    }

    // GETTERS
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }
    public double getValorMatricula() { return valorMatricula; }

    // MÉTODOS
    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: $" + valorMatricula);
    }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public double calcularPagoFinal() {
        return valorMatricula;
    }

    // SOBRECARGA
    public double calcularPagoFinal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }
}
