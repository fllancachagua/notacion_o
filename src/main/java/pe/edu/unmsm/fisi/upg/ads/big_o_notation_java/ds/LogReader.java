package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java.ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class LogReader implements Iterable<LogLine> {
    private final int sizeLogLines;
    private final int sizeUniqueIps;
    private Collection<String> uniqueIps;
    private HashMap uniqueIpsV2;

    public LogReader(int sizeLogLines, int sizeUniqueIps) {
        this.sizeLogLines = sizeLogLines;
        this.sizeUniqueIps = sizeUniqueIps;
       // this.uniqueIps = new ArrayList<String>();
        this.uniqueIpsV2 = new HashMap<String,String>();
    }

    public Iterator<LogLine> iterator() {
        return new LogReaderIterator(this.sizeLogLines, this.sizeUniqueIps);
    }

    @SuppressWarnings("unused")
    public int readAllLogs() {
        int sizeLogLines = 0;
        for (LogLine line : this) {
            String ip = line.getIP();
            sizeLogLines++;
        }
        return sizeLogLines;
    }

    public int getSizeUniqueIps() {

        for (LogLine logLine : this) {
            String ip = logLine.getIP();
            if (!this.uniqueIps.contains(ip)) {
                this.uniqueIps.add(ip);
            }
        }
        return this.uniqueIps.size();
    }
    
    public int getSizeUniqueIpsv2() {

        for (LogLine logLine : this) {
            String ip = logLine.getIP();
            if (!this.uniqueIpsV2.containsKey(ip)) {
                this.uniqueIpsV2.put(ip,ip);
            }
        }
        return this.uniqueIpsV2.size();
    }    
}
