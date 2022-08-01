import java.util.Scanner;

public class vucut {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double boy,kilo,index;

        System.out.print("boyunuzu giriniz : ");
        boy=inp.nextDouble();

        System.out.print("kilonuzu giriniz : ");
        kilo=inp.nextDouble();

        index=kilo/(boy*boy);

        System.out.print("vucut kutle indeksiniz :  "+index);
    }
    }
