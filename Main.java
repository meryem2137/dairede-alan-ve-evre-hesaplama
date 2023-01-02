import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double pi=3.14;
        int r;
        Scanner input=new Scanner(System.in);
        System.out.print("dairenin yarıçapını giriniz: ");
        r=input.nextInt();
        double daireninalani=(pi*r*r);
        double dairenincevresi=(pi*2*r);
        System.out.println("daireninalani: "+daireninalani);
        System.out.println("dairenincevresi: "+dairenincevresi);



    }

}
