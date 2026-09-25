//package Assignment_1;

import java.util.Scanner;
import java.util.Stack;

public class StackApplication {
    //Implementing PostFix Algorithm
    public static int postfix(String exp)
    {
        Stack<Integer> stack = new Stack<>();
        int operant1 = 0;
        int operant2 = 0;

        for(int i=0;i<exp.length();i++)
        {
            char ele = exp.charAt(i);
            if(Character.isDigit(ele))
            {
                stack.push(ele-'0');
            }
            else
            {
                operant1 = stack.pop();
                operant2 = stack.pop();

                switch (ele) {
                    case '+':stack.push(operant2+operant1);
                        break;
                    case '-':stack.push(operant2-operant1);
                        break;
                    case '/':stack.push(operant2/operant1);
                        break;
                    case '*':stack.push(operant2*operant1);
                        break;
                }
            }  
        }
        return stack.peek();
    }
    //Implementing Prefix Algorithm
    public static int prefix(String str)
    {
        Stack<Integer> stack = new Stack<>();
        int op1 = 0;
        int op2 = 0;
        for(int i=str.length()-1;i>=0;i--)
        {
            char ele = str.charAt(i);
            if(Character.isDigit(ele))
            {
                stack.push(ele - '0');
            }
            else
            {
                op1 = stack.pop();
                op2 = stack.pop();

                switch (ele) {
                    case '+':stack.push(op1+op2);
                        break;
                    case '-':stack.push(op1-op2);
                        break;
                    case '*':stack.push(op1*op2);
                        break;
                     case '/':stack.push(op1/op2);
                        break;
                }
            } 
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expression for PostFix");
        String str1 = sc.next();
        System.out.print("Enter Expression for PreFix");
        String str2 = sc.next();
        
        // String str3 = "+53";
        // String str4 = "+-*234/82";

        System.out.println(postfix(str1));
        // System.out.println(postfix(str2));

        System.out.println(prefix(str2));
        // System.out.println(prefix(str4));
    }
}