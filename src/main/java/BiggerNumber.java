import java.util.Scanner;

public class BiggerNumber {
    public static void main(String srgs[]){
    System.out.println("Podaj trzy liczby");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min;
        int max;
        if(a<b && a<c) {
            min=a;
            System.out.println("Minimum is a =" + min);
            if(b<c){
                max=c;
                System.out.println("Maximum is c=" + max);
            }
            else {
                max=b;
                System.out.println("Maximum is b=" + max);
            }
        }
        else if(b<a && b<c){
            min=b;
            System.out.println("Minimum is b=" + min);
            if(a<c){
                max=c;
                System.out.println("Maximum is c=" + max);
            }
            else {
                max=a;
                System.out.println("Maximum is a=" + max);
            }
        }
        else{
            min=c;
            System.out.println("Minimum is c=" + min);
            if(b<a){
                max=a;
                System.out.println("Maximum is a=" + max);
            }
            else{
                max=b;
                System.out.println("Maximum is b=" + max);
            }
        }
    }
}
