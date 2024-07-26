package com.mycompany.mavenproject6;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Mavenproject6 {

    public static void main(String[] args) {
       ArrayList<Integer> List =  new ArrayList<>();
        System.out.println("mumber ?");
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       for(int i = 1; i<= num;i++)
       {
           System.out.println("Enter a number"+i+":" );
           int number = input.nextInt();
           List.add(number);
       }
       for(int j =0; j< List.size(); j++)
       {
           if(List.get(j)%2==0)
           {
               System.out.println("The number of array"+j+"is even numner");
           }
           else
           {
                System.out.println("The number of array"+j+"is odd numner");
           }
       }
    }
}
