package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
            Random rand = new Random();
            int freq[] = new int[7];

            for(int roll = 1; roll<1000; roll++){
                ++freq[1+rand.nextInt(6)];
            }
        System.out.println("face\tFreq");

            for(int face=1; face<freq.length; face++){
                System.out.println(face+"\t" + freq[face]);
            }
    }
}
