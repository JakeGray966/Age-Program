/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageprogram;

import java.util.*;
 
 
public class AgeProgam {


    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double agetotal = 0;
        for(int i = 0 ; i<(10); i++){


            double age;
            System.out.println("Input desired age as integer:");

            agetotal = agetotal + input.nextDouble();

        }

        System.out.println((agetotal) / (10));
        System.out.println("yay it worké");

    }
    }
