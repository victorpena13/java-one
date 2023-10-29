import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        // has to use toString because arrays are a reference.

        Person[] persons = new Person[3];

        System.out.println(Arrays.toString(persons));



    }
}
