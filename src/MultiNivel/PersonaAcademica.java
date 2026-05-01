package MultiNivel;
//Padre
public class PersonaAcademica {
    private String codigo;
    private String nombre;
    private int edad;

    // SETTERS
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

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
    }

    // GETTERS
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    // METODOS
    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void describirRol() {
        System.out.println("Rol: Persona académica");
    }

    public double calcularPago() {
        return 0;
    }
}
