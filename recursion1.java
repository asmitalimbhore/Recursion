//print n natural numbers from 1 to n
import java.util.Scanner;
public class recursion1 {

    static void printDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        
        printDecreasing(n-1);
        System.out.println(n);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printDecreasing(n);
        
    }
    
}

