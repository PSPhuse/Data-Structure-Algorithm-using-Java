//package Assignment_1;

import java.util.Scanner;
import java.util.Stack;

public class Conversion {

    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    public static  int presedence(char c)
    {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public void postfix()
    {
        StringBuilder str = new StringBuilder();
        char chr = ' ';
        System.out.println("Enter an Expression:");
        String exp = sc.next();
        for(int i=0;i<exp.length();i++)
        {
            chr = exp.charAt(i);
            if(Character.isLetterOrDigit(chr))         //Store Character into String/Result
            {
                str.append(chr);
            }
            else if(chr =='(' || chr == '{' || chr == '[')    //if(there is Opening Brackets push them into stack)
            {
                stack.push(chr);
            }
            else if(chr == ')'|| chr == '}' || chr == ']')  //if Closing Bracket is Come 
            {
                while(!stack.isEmpty() && (stack.peek() != '(' && stack.peek() != '{' && stack.peek() != '['))  //pop and store in string untile matching brackets not found
                {
                    str.append(stack.pop());
                }
                stack.pop();
            }
            else
            {
                while (!stack.isEmpty() && presedence(chr) <= presedence(stack.peek()))   //Check Presedence of Operant
                {
                    str.append(stack.pop());
                }
                stack.push(chr);
            }
        }
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        System.out.println("Postfix Expression:"+str);
        sc.close();
    }
    
    public static void main(String[] args) {
        Conversion ch = new Conversion();

        ch.postfix();
        
    }
}