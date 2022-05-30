package tasks;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create an instance of the TaskMethods class
        TaskMethods t = new TaskMethods();
        //Create a list of integers
        int[] list = {1,49,5,8,18,2,8,7};
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(20);
        lista.add(5);
        lista.add(10);

        //Use the checkMax method to check the biggest integer in the list (Feel free to modify the integers inside the list to make sure the method works)
        System.out.println("The biggest integer in the given list is: " + t.checkMax(list));
        //Example for using Math.PI
        System.out.println(Math.PI);

        //Example on how to use methods from the Examples class
        Examples e = new Examples();
        e.sumNumbers(5);
        e.useRemainder(6,2);
        e.usePi(3);
        

        //Use all of your methods below when you are finished creating them in TaskMethods.java
        t.hoursToSec(1);
        System.out.println(t.areNumsEqual(1,2));
        System.out.println(t.countArea(20,20));
        System.out.println(t.calculateTriangle(40, 60));
        System.out.println(t.checkRemainder(6));
        System.out.println(t.countCircleArea(10));
        System.out.println(t.sumOfValue(lista));
        System.out.println(t.checkIfListHasValue(list, 8));
        System.out.println(t.oddOrEven(11));
    }
}
