package tasks;
public class Examples {

    public void sumNumbers(int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=i;
            System.out.println("sum is " + sum);

        }
        System.out.println("Sum of numbers from 0 to " + (n-1) + " = " + sum);

    }

    public void useRemainder(int n, int argument){
        int remainder = n%argument; //How many times does n fit into the argument number and what remains after(if the input would be 8 the remainder would be 0)
        System.out.println("The remainder for " + n + " when the argument is " + argument + " is " + remainder);
    }

    public void usePi(int n){
        double result = n*Math.PI; //Math.PI equals 3.141592653589793
        System.out.println(n + " * Pi = " + result );

    }

}
