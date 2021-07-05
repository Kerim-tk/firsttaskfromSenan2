package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("если хотите ввести новых студентов напишите 1 и введите код и имя студента\nесли хотите увидеть имеющихся студентов напишите 2  ");


        ArrayList<Worker> workerList = new ArrayList<>();

        workerList.add(new Worker("123, Васильев Евстахий Борисович"));

        
        





    }

    public static class Worker {
        public Worker(String s) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();

            if(i == 2){


                System.out.println(s);
            }
            if(i == 1){
                int p = scan.nextInt();
                String u = scan.nextLine();

                System.out.println(p + u );
                System.out.println(s);


            }
        }
        }
    }

