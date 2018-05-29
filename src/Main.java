import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int count = 0;
        int sum = 1;
        int b = 1;
        int a = 0;
        while (sum<l){
            if(a>b){
                b = next(a,b);
                sum+=b;
            }else {
                a = next(a,b);
                sum+=a;
            }
            count++;
        }
        System.out.println(count);
    }

    private static int next(int a, int b){
        return a+b;
    }
}
