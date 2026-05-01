package HerenciaMultiNivel;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> lista = new ArrayList<>();

        // becado
        BecadoExcelencia b = new BecadoExcelencia();

        System.out.println("Ingrese código:");
        b.setCodigo(sc.nextLine());

        System.out.println("Ingrese nombre:");
        b.setNombre(sc.nextLine());

        System.out.println("Ingrese promedio:");
        b.setPromedio(sc.nextDouble());

        System.out.println("Ingrese matrícula:");
        b.setValorMatricula(sc.nextDouble());

        System.out.println("Ingrese % beca:");
        b.setPorcentajeBeca(sc.nextDouble());

        System.out.println("Ingrese bono excelencia:");
        b.setBonoExcelencia(sc.nextDouble());

        lista.add(b);

        sc.nextLine(); // limpiar buffer

        // rewgular
        RegularConRecargo r = new RegularConRecargo();

        System.out.println("Ingrese código:");
        r.setCodigo(sc.nextLine());

        System.out.println("Ingrese nombre:");
        r.setNombre(sc.nextLine());

        System.out.println("Ingrese promedio:");
        r.setPromedio(sc.nextDouble());

        System.out.println("Ingrese matrícula:");
        r.setValorMatricula(sc.nextDouble());

        System.out.println("Ingrese número materias:");
        r.setNumeroMaterias(sc.nextInt());

        System.out.println("Ingrese recargo:");
        r.setRecargoPendiente(sc.nextDouble());

        lista.add(r);

        // mostrar
        for (Estudiante e : lista) {
            e.mostrarDatos();
            System.out.println("Pago final: $" + e.calcularPagoFinal());
            System.out.println("----------------------");
        }
    }
}
