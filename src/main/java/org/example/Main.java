package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Start");
        Scanner reader = new Scanner(System.in);
        int op, flag=0;
        int num, exp;

        do{
            System.out.println("Functions: \n");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Modulus");
            System.out.println("5. Exit \n");
            System.out.print("Enter choice: \n");
            op = reader.nextInt();
            if(op==5) flag = 1;
            else{
                switch(op){

                    case 1:
                        System.out.println("Adding two numbers!! \n");
                        System.out.print("Enter 1st number: \n");
                        num = reader.nextInt();
                        System.out.print("Enter 2nd number: \n");
                        exp = reader.nextInt();
                        add(num,exp);
                        break;

                    case 2:
                        System.out.println("Subtracting two numbers!!\n");
                        System.out.print("Enter 1st number: \n");
                        num = reader.nextInt();
                        System.out.print("Enter 2nd number: \n");
                        exp = reader.nextInt();
                        subt(num,exp);
                        break;

                    case 3:
                        System.out.println("Multiplying two numbers!!\n");
                        System.out.print("Enter 1st number: \n");
                        num = reader.nextInt();
                        System.out.print("Enter 2nd number: \n");
                        exp = reader.nextInt();
                        mul(num,exp);
                        break;


                    case 4:
                        System.out.println("Modulus of two numbers!!\n");
                        System.out.print("Enter 1st number: \n");
                        num = reader.nextInt();
                        System.out.print("Enter 2nd number: \n");
                        exp = reader.nextInt();
                        per(num,exp);
                        break;

                    default:
                        System.out.println("Invalid input!!");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }

    public static int add(int num,int exp){
        int c=num+exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("addition of "+num+" and "+exp+". Result:   "+c+"\n");
        return c;
    }

    public static int subt(int num,int exp){
        int c=num-exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("subtraction of "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
    public static int mul(int num,int exp){
        int c = num*exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("multiplication of "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
    public static int per(int num, int exp){
        int c = num%exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("modulus operation for "+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
}