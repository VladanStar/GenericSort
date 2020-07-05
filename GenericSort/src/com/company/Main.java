package com.company;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // kreiranje niza sa integer elementima
        Integer [] inArray = {new Integer(2), new Integer(4),new Integer(3)};
        // kreiranje niza sa double elementima
        Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};
        // kreiranje niza Character elemenata
        Character[] characterArray = {new Character('a'), new Character('J'), new Character('r')};
        // kreiranje niza sa String elementima
        String []stringArray = {"Tom","Susan","Kim"};

        // sortiranje nizova
        sort(inArray);
        sort(doubleArray);
        sort(characterArray);
        sort(stringArray);

        // prikazortiranih nizova
        System.out.println("Sorted integer objects: ");
        printList(inArray);
        System.out.println("Sorted double objects:");
        printList(doubleArray);
        System.out.println("Sorted character object:");
        printList(characterArray);
        System.out.println("Sorted string object:");
        printList(stringArray);


    }
    // sortiranje niza aa uporedivim Comparable elementima


    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;

        for(int i = 0; i<list.length;i++){
            // nalazenje minimuma u listi[i+1.list.length-2]
            currentMin = list[i];
            currentMinIndex = i;


            for (int j = i+1; j< list.length;j++){
                if(currentMin.compareTo(list[j])>0){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // zamena list[i] sa list[currentMinIndex] ako je potrebno
            if(currentMinIndex !=0){
                list[currentMinIndex] = list[i];
                list[i]= currentMin;
            }
        }
    }
    // stampanje niza objekata

    private static void printList(Object[] list) {
        for (int i =0; i<list.length;i++){
            System.out.println(list[i] + " ");
            System.out.println();
        }
    }
}
