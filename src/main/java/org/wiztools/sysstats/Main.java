package org.wiztools.sysstats;

public class Main {
    public static void main(String[] arg) {
        // Number of cores:
        int cpus = Runtime.getRuntime().availableProcessors();
        System.out.println(Formatter.format("CPU cores", cpus));

        // Max memory:
        long memMax = Runtime.getRuntime().maxMemory();
        System.out.println(Formatter.format("Max memory", memMax));

        // Free memory:
        long memFree = Runtime.getRuntime().freeMemory();
        System.out.println(Formatter.format("Free memory", memFree));
    }
}
