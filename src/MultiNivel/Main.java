package MultiNivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DocenteInvestigador d = new DocenteInvestigador();

        System.out.println("Ingrese código:");
        d.setCodigo(sc.nextLine());

        System.out.println("Ingrese nombre:");
        d.setNombre(sc.nextLine());

        System.out.println("Ingrese edad:");
        d.setEdad(sc.nextInt());

        System.out.println("Ingrese horas de clase:");
        d.setHorasClase(sc.nextInt());

        System.out.println("Ingrese valor por hora:");
        d.setValorHora(sc.nextDouble());

        System.out.println("Ingrese número de publicaciones:");
        d.setPublicaciones(sc.nextInt());

        // POLIMORFISMO
        PersonaAcademica persona = d;

        System.out.println("\n DATOS ");
        persona.mostrarDatos();
        persona.describirRol();

        System.out.println("Pago final: $" + persona.calcularPago());

        // sobrecargad
        System.out.println("Pago con bono extra: $" + d.calcularPago(50));
    }
}