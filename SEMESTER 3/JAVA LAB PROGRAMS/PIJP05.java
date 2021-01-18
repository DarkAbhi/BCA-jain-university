package com.bca;

class PIJP05 {
    public static void main(String arg[]) {
        Runtime r = Runtime.getRuntime();
        long memory1, memory2;
        long mb = 1024 * 1024;
        Integer integer[] = new Integer[1000];
        System.out.println("Total memory is: " + r.totalMemory() / mb);
        memory1 = r.freeMemory() / mb;
        System.out.println("Initial free memory: " + memory1);
        r.gc();
        memory1 = r.freeMemory() / mb;
        System.out.println("Free memory after garbage " + "collection: " + memory1);
        for (int i = 0; i < 1000; i++)
            integer[i] = new Integer(i);
        memory2 = r.freeMemory() / mb;
        System.out.println("Free memory after allocation: " + memory2);
        System.out.println("Memeory used by allocation: " + (memory1 - memory2));
        for (int i = 0; i < 1000; i++)
            integer[i] = null;
        r.gc();
        memory2 = r.freeMemory() / mb;
        System.out.println("Free memeory after  " + "collecting discarded Integers: " + memory2);
    }
}
