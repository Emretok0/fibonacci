import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Kaç adet: ");
        int x = in.nextInt();
        x-=2;
        int a=0, b=1, i=1 ,total=0;
        System.out.print("0-1-");
        while (i<=x){
            total = a+b;
            a=b;
            b=total;
            System.out.print(total+"-");
            i++;
        }

        //  0
        //  1
        //  1
        //  2
        //  3
        //  5
        //  8
        //  13

    }
}
