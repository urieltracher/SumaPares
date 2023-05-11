package sumapares;

/**
 *
 * @author maryse
 *
 * Ciclo for
 * Suma de los M primeros números pares.
 *
 */
public class SumaPares {

    public static void main(String[] args) {
        final int M = 12;
        int suma = sumarNumerosPares(M);
        System.out.println("La suma de los " + M
                + " primeros números pares: " + suma);
    }

    public static int sumarNumerosPares(int M) {
        int suma = 0;
        for (int n = 1; n <= M; n++) {
            suma += 2 * n;
        }
        return suma;
    }
}

