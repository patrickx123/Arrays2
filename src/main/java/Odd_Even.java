
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER-PC
 */
public class Odd_Even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("—————————————");
        System.out.println("      WELCOME TO");
        System.out.println("Patrick STAT CALCULATOR");
        System.out.println("—————————————");
        System.out.println("  SEPARATING ODD AND ");
        System.out.println(" EVEN VALUE ELEMENTS");
        System.out.println("     IN AN ARRAY");
        System.out.println("—————————————");
        System.out.println("Enter prefered array size");
        int size = input.nextInt();
        
        int list[]=new int[size];
        System.out.println("Enter the array values");
        for (int i =0; i<list.length;i++){
            System.out.println("Value @ index "+i);
            list[i] = input.nextInt();}
        
        System.out.println("—————————————");
        System.out.println("inputed array values: ");
        for (int i =0; i<list.length;i++){
            System.out.print(list[i]+", ");}
        
        System.out.println(" ");
        System.out.println("—————————————");
        System.out.println("   ANALYSIS RESULT:");
        
        
        System.out.println("—————————————");
        System.out.print("EVEN VALUES: ");
        for(int i =0;i<list.length;i++){
            if (list[i]%2 == 0){
                int even = list[i];
                System.out.print(even+", ");}
        }
        System.out.println(" ");
        System.out.print("ODD VALUES: ");
        for(int i =0;i<list.length;i++){
            if (list[i]%2 != 0){
                int odd = list[i];
                System.out.print(odd+", ");}
        }
        System.out.println(" ");
        System.out.println("—————————————");

    }
}
