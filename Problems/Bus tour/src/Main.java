import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        int n = 1;
        while(n < bridges){
            if(height >= scanner.nextInt()){
                System.out.println("Will crash on bridge " + n);
                break;
            }
            n++;
        }
        if(n == bridges){
            System.out.println("Will not crash");
        }
    }
}