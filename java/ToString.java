class ToString {
    public static void main(String[] args){
        // no toString() -- adds int values instead of concatenating
        int num1 = 3;
        int num2 = 4;
        String name = "Bob";
        System.out.println(num1 + num2 + name);

        // toString() -- concatenates values instead of adding
        String num1_a = Integer.toString(num1);
        String num2_a = Integer.toString(num2);
        System.out.println(num1_a + num2_a + name);
    }       
}