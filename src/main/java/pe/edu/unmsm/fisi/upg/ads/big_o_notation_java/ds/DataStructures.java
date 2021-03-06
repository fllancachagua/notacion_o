package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java.ds;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class DataStructures {
	private final static int SIZE_LOG_LINES = 100000;
    private final static int SIZE_UNIQUE_IPS = 90001;
    private static LogReader logReader = new LogReader(SIZE_LOG_LINES, SIZE_UNIQUE_IPS);

    public static void main(String[] args) {
        System.out.println("Reading all log entries...");
        Stopwatch stopwatch = Stopwatch.createStarted();
        int sizeLogLines = logReader.readAllLogs();
        System.out.println("Number of lines: " + sizeLogLines);
        System.out.println(String.format("Time elapsed: %d milliseconds", stopwatch.elapsed(TimeUnit.MILLISECONDS)));

        System.out.println("\nProcessing unique IPs...");
        Stopwatch stopwatchUI = Stopwatch.createStarted();
        int sizeUniqueIps = logReader.getSizeUniqueIps();
        System.out.println(String.format("Number of unique IPs O(N^2): %d", sizeUniqueIps));
        System.out.println(String.format("Time elapsed: %d milliseconds", stopwatchUI.elapsed(TimeUnit.MILLISECONDS)));
        
        System.out.println("\nProcessing unique IPs... Mejorado");
        Stopwatch stopwatchUIv2 = Stopwatch.createStarted();
        int sizeUniqueIpsv2 = logReader.getSizeUniqueIpsv2();
        System.out.println(String.format("Number of unique IPs O(N): %d", sizeUniqueIpsv2));
        System.out.println(String.format("Time elapsed: %d milliseconds", stopwatchUIv2.elapsed(TimeUnit.MILLISECONDS)));        
    }
}
