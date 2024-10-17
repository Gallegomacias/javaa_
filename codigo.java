import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numeroFinal = 0;
        int sumaAcumulada = 0;
        int contador  = 0;

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el número que desea calcular: ");
        numeroFinal = lector.nextInt();

        while (numeroFinal >= contador) {
            sumaAcumulada += contador;
            icontador++;
        }

        System.out.println("La suma de los primeros " + numeroFinal + " números naturales es igual a " + sumaAcumulada);
    }
}
