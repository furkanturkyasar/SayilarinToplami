import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x,total=0;

        do {
            System.out.print("Sayi giriniz: ");
            x=scan.nextInt();
            if (x % 4 == 0){
                total+=x;
            }
        }while (x%2==0);
        System.out.println("Sayilarin toplami: "+total);




    }

}
