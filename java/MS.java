// Count # of time that a letter appears in a sentence
// sentence: "I will arrive in Mississippi really soon"

class MS {
    public static void main(String[] args){
        String s = "I will arrive in Mississippi really soon";
        char[] ch = s.toCharArray();
        boolean[] b = new boolean[s.length()];

        System.out.println("Character Occurrences:");
        for (int i = 0; i < ch.length; i++) {
            if (b[i]) continue;     // Skip already counted characters
            int c = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    c++;
                    b[j] = true;     // Mark character as counted
                }
            }
            System.out.println(ch[i] + " : " + c);
        }
    }       
}