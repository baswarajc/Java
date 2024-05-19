package ProgrammingPractice;

import collectionprograms.SortArrayList;

public class HeapDemo {

    public static void main(String[] args) {
         Runtime r = Runtime.getRuntime();

        System.out.println("Results in bytes ");
        System.out.println();
        System.out.println("Max Heap Memory: "+ r.maxMemory());
        System.out.println("Total Memory "+ r.totalMemory());
        System.out.println("Free Memory "+ r.freeMemory());
        System.out.println("Consumed Memory "+(r.totalMemory()-r.freeMemory()));

        System.out.println();

        double mb = 1024*1024;
        System.out.println("Results in mb ");
        System.out.println();
        System.out.println("Max Heap Memory: "+ r.maxMemory()/mb);
        System.out.println("Total Memory "+ r.totalMemory()/mb);
        System.out.println("Free Memory "+ r.freeMemory()/mb);
        System.out.println("Consumed Memory "+(r.totalMemory()-r.freeMemory())/mb);

    }
}
