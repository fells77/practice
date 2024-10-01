import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // get user input
        System.out.println("Enter password:");
        String password = input.nextLine();  

        // convert user input (str) to array
        List<Character> arrayList = new ArrayList<>();
        // this is a "for each" loop
        for(char ch : password.toCharArray()){
            arrayList.add(ch);
        }
        
        // print original password
        System.out.println("Original: " + password);

        // shuffle the password
        Collections.shuffle(arrayList);

        // god i hate java.  create new string and then iterate through the shuffled arrayList and append to the string
        // building a new string vs. just printing the results one char at a time to preserve sanity later (trust me)
        String shuffledPass = "";
        System.out.print("Shuffled: "); // if you don't use "println" it won't line-break; that's all it does
        for(int i=0; i<arrayList.size(); i++){
            shuffledPass = shuffledPass + arrayList.get(i);
        }
        System.out.println(shuffledPass);
    }       
}