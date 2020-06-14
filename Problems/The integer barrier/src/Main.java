import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = scanner.nextInt();
        while(scanner.hasNext() && num != 0 && sum < 1000){
            sum += num;
            num = scanner.nextInt();
        }
        if(sum >= 1000){
            System.out.println(sum-1000);
        }else{
            System.out.println(sum);
        }
    }
}