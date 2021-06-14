package com.company;

public class Main {

    enum Semaphore{
        RED,
        YELLOW,
        GREEN
    }

    public static void main(String[] args) {

        Semaphore semaphore = Semaphore.YELLOW;

         switch(semaphore){

            case RED:
                System.out.println("RED");
                break;

            case YELLOW:
                System.out.println("YELLOW");
                break;

            case GREEN:
                System.out.println("GREEN");
                break;
        }
        

    }

}
