// Problem statement:
//     I'm having a party and invited 40 friends.  I have a list of 10 items that I've requested be brought by my guests,
//     each has been assigned a <key:value> pair as below:

//     1   :   potato chips
//     2   :   beer
//     3   :   soda
//     4   :   pretzels
//     5   :   cheese puffs
//     6   :   crackers
//     7   :   cheese
//     8   :   wine
//     9   :   fruit
//     10  :   vegetables

//     Based on their RSVPs which included the keys, I need to figure out what items are being brought (I don't care how many)
//     so I know what I need to pick up myself.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class SetUsage {
    public static void main(String args[]) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        for(int i=0; i<40; i++){
            int rand = (int)(Math.random() * 20 + 1);
            values.add(rand);
        }
    // System.out.println(values);

    // convert arrayList to hashSet so we can....
    HashSet<Integer> hashSet = new HashSet<>(values);

    // ...convert the hashSet to a set
    Set<Integer> set = new HashSet<>(hashSet);

    System.out.println("Here are the items that are being brought:");
    System.out.println(set);
    System.out.println("I'm missing " + (20 - set.size()) + " items");
    }
}