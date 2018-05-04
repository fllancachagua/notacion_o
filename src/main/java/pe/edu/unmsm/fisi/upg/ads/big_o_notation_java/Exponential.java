package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

    public static void main(String[] args) {
        long N = 40;
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
        System.out.println(String.format("Fibonacci Exponencial: Time elapsed: %d microseconds", stopwatch.elapsed(TimeUnit.MICROSECONDS)) + "\n");
        
        Stopwatch stopwatchFL = Stopwatch.createStarted();
        for (int i = 1; i <= N; i++) {
            try {
                long fibonacci = exponential.fibonacci_lineal(i);
                System.out.println(i + " => " + fibonacci);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Fibonacci Lineal: Time elapsed: %d microseconds", stopwatchFL.elapsed(TimeUnit.MICROSECONDS)) + "\n");
        
        Stopwatch stopwatchPD = Stopwatch.createStarted();
        for (int i = 1; i <= N; i++) {
            try {
                long fibonacci = exponential.fibonacci_programacion_dinamica(i);
                System.out.println(i + " => " + fibonacci);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Fibonacci Dinamica: Time elapsed: %d microseconds", stopwatchPD.elapsed(TimeUnit.MICROSECONDS)) + "\n");
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
        int aux1 = 0;
        int aux2 = 1;

        for (int k = 1; k < n; k++) {
            int aux3;
            aux3 = aux1 + aux2;
            aux1 = aux2;
            aux2 = aux3;
        }

        return aux2;
    }

    public static long fibonacci_programacion_dinamica(int numeroFib) throws Exception {
        long tablaDinamica[] = new long[numeroFib+1];
        if (numeroFib <2) {
            return numeroFib;
        } else {
            tablaDinamica[0] = 1;
            tablaDinamica[1] = 1;
            for (int i = 2; i <= numeroFib; i++) {
                tablaDinamica[i] = tablaDinamica[i - 1] + tablaDinamica[i - 2];
            }
        }
        return tablaDinamica[numeroFib -1];
    }

}
