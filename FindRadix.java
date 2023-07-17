import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class FindRadix {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String num=sc.nextLine();
        if(num.matches("[01]+"))
        {
            System.out.println("Binary Radix=2");
        }
        else if(num.matches("[0-7]+"))
         {
            System.out.println("Octal Radix=8");
         }
         else if(num.matches("[AB23]+"))
            {
              System.out.println("Hexadecimal Radix=16");
            }
            else if(num.matches("[0-9]+"))
            {
                System.out.println("Decimal Number Radix=10");
            }
            else
            {
                System.out.println("Not a Number");
            }
         }
    }
    

