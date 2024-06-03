import java.util.Scanner;
 
public class Program {
// какие условия сравнения? считаем ли мы a = A ? например если бы сравнивали почту, то capsLock нам был бы не важен
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Input string a: ");
        String a = in.nextLine();
        System.out.print("Input string b: ");
        String b = in.nextLine();
        if (a.equals(b)) 
        { 
            System.out.printf("Equal");
        } else 
        {
            System.out.printf("Not Equal");
        }
        in.close();
    }
}

