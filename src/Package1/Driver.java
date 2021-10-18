package Package1;

import java.util.Scanner;

public class Driver {
    public void doTask(){
        String input;
        Scanner sc = new Scanner(System.in);
        //Take input string
        System.out.print("Enter string: ");
        input = sc.nextLine();
        BracketsBalancing bb = new BracketsBalancing();
        // Check if paranthesis in input string are balanced or not
        if(bb.isBalanced(input))
            System.out.println("\nString \""+input+"\" is balanced.\n");
        else
            System.out.println("\nString \""+input+"\" is not balanced.\n");

        sc.close();
    }
}
