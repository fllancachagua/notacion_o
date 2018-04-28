package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

    public static void main(String[] args) {
        long N = 20;
        Exponential exponential = new Exponential();
        Stopwatch stopwatch = Stopwatch.createStarted();
        for (int i = 1; i <= N; i++) {
            try {
                long fibonacci = exponential.fibonacci(i);
                System.out.println(i + " => " + fibonacci);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Exponencial: Time elapsed: %d seconds", stopwatch.elapsed(TimeUnit.SECONDS)) + "\n");

        for (int i = 1; i <= N; i++) {
            try {
                long fibonacci = exponential.fibonacci_lineal(i);
                System.out.println(i + " => " + fibonacci);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Lineal: Time elapsed: %d seconds", stopwatch.elapsed(TimeUnit.SECONDS)) + "\n");

        for (int i = 1; i <= N; i++) {
            try {
                long fibonacci = exponential.fibonacci_programacion_dinamica(i);
                System.out.println(i + " => " + fibonacci);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Dinamica: Time elapsed: %d seconds", stopwatch.elapsed(TimeUnit.SECONDS)) + "\n");
    }

    public long fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("N can not be less than zero");
        }
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long fibonacci_lineal(int n) throws Exception {
        int i = 0;
        int j = 1;

        for (int k = 1; k < n; k++) {
            int t;
            t = i + j;
            i = j;
            j = t;
        }

        return j;
    }

    public static long fibonacci_programacion_dinamica(int numeroFib) throws Exception {
        long tablaDinamica[] = new long[numeroFib+1];
        if (numeroFib <=2) {
            return 1;
        } else {
            tablaDinamica[0] = 0;
            tablaDinamica[1] = 1;
            for (int i = 2; i <= numeroFib; i++) {
                tablaDinamica[i] = tablaDinamica[i - 1] + tablaDinamica[i - 2];
            }
        }
        return tablaDinamica[numeroFib - 1];
    }

}
