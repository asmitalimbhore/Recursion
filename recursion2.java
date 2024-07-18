//print n natural numbers from n to 1
import java.util.Scanner;
public class recursion2 {
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printIncreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printIncreasing(n);
        
    }
    
}

    

