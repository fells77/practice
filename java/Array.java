import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.commons.lang3.ArrayUtils;


class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // get user input
        System.out.println("Enter password:");
        String password = input.nextLine();  

        // convert user input (str) to array
        char[] charArray = password.toCharArray();
        Character[] charObjectArray = ArrayUtils.toObject(charArray);
        
        // print original password
        System.out.println("Original: " + passArray);

        // shuff the password and print
        Collections.shuffle(passArray);
        System.out.println("Random: " + passArray);
    }       
}