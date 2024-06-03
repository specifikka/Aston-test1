import java.util.Scanner;
 
public class Program {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number a: ");
        int a = in.nextInt();
        
        System.out.print("Input a number b: ");
        int b = in.nextInt();
          
        if (a > b) {
            System.out.print("a > b");
        } else if(a < b) {
            System.out.print("a < b");
        } else if (a == b) {
            System.out.print("a = b");
        }
        in.close();
    }
}
