import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double edad = 0, estadoCivil = 0, estatura = 0, sexo = 0;
        double promedioEdad = 0, promedioEstatura = 0, porcentajePersonas = 0;
        int contadorPersonas = 0, cantidadPersonas = 2;
        double acumuladorEdad = 0, acumuladorEstatura = 0;
        
        
        Scanner input = new Scanner(System.in);
        
        
        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
            System.out.println("Ingrese la edad de la persona " + numeroPersona + ": ");
            edad = input.nextDouble();
            
            System.out.println("Ingrese el estado civil de la persona " + numeroPersona + " (1. Soltero, 2. Casado): ");
            estadoCivil = input.nextDouble();
            
            System.out.println("Ingrese la altura de la persona " + numeroPersona + " en cm: ");
            estatura = input.nextDouble();
            
            System.out.println("Ingrese el sexo de la persona " + numeroPersona + " (1. Hombre, 2. Mujer): ");
            sexo = input.nextDouble();
            
           
            if (edad > 18 && estadoCivil == 1 && estatura > 170 && sexo == 1) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
            }
        }
        
        
        if (contadorPersonas > 0) {
            promedioEdad = acumuladorEdad / contadorPersonas;
            promedioEstatura = acumuladorEstatura / contadorPersonas;
            porcentajePersonas = (double) contadorPersonas / cantidadPersonas * 100;
            
            
            System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años");
            System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " cm");
            System.out.println("El porcentaje de las personas que cumplen con la condición es del: " + porcentajePersonas + " %");
        } else {
            System.out.println("Ninguna persona cumple con las condiciones.");
        }
        
        
        input.close();
    }
}
