package String_concept;

import java.util.Scanner;

public class chaekUppercase {
       public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // System.out.println("String base case in given String ");
        // System.out.println("***********************************");
        System.out.println("Enter a String in");
        String a=in.nextLine();
        int length=0;
        for (char b : a.toCharArray()) {
            System.out.print(b+" ");
            length++;
        }
        
        int lower=0;
        for(int i=0;i<length;i++)
        {
            char ch=a.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                lower++;
            }
            //System.out.print((char)(a.charAt(i)-32)+" ");
        }

        if(lower==length)
        {
            System.out.println("\nThe give string is Uppercase ");

        }
        else{
            System.out.println("The give string not is Uppercase ");
        }
        in.close();
    }
}
