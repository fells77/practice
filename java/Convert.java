// Capitalizes the first letter of an entered string

import java.util.Scanner;

class Convert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // get user input
        System.out.println("Enter password:");
        String pass = input.nextLine();

        // public String substring(int start, int end)
        // public String substring(int start)
        String pass2 = pass.substring(0, 1).toUpperCase() + pass.substring(1);
        System.out.println(pass2);
    }       
}