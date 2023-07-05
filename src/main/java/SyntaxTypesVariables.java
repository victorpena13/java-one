public class SyntaxTypesVariables {

    public static void main(String[] args) {
        int myFavoriteNumber = 13;
        String myString = "this is a string of words";
//        myString = 'c'; requires string and provided char.
        System.out.println(myString);
//        myString = 3.14159; requires string provided double

        float myNumber;
//        System.out.println(myNumber); // not initialized.
        myNumber = 123L;
//        myNumber = 123; // variable is already assigned to this number;
        myNumber = (float) 3.14;
        System.out.println(myNumber);

        System.out.println("testing x: ");
        int x = 5;
        System.out.println(x++); // 5
        System.out.println(x); // 6

        System.out.println("testing y: ");
        int y = 5;
        System.out.println(++y); // 6
        System.out.println(y); //6





    }
}
