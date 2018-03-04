import java.util.Scanner;

public class GettingFromKeybord {
    public static void main(String srgs[]){
        System.out.println("Give temperature in degree Celcius");
        Scanner reader = new Scanner(System.in);
        int Degree = reader.nextInt();
        System.out.print(Degree +" "+ "Degree Celcius is" + " "+ (1.8*Degree+ 32) + " "+ "Faranhait");
    }
}
