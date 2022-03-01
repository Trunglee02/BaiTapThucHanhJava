<<<<<<< HEAD
import java.util.Scanner;

public class App47 {
    public static void main(String[] args){
        int so, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: "); so = sc.nextInt();

        while(true){
            tong += so;
            if(tong <= 100){
                System.out.print("Nhap so tiep theo: ");
                so = sc.nextInt();
            }
            else{
                System.out.print("Tong = " + tong);
                break;
            }
        }
    }
}
=======
import java.util.Scanner;

public class App47 {
    public static void main(String[] args){
        int so, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: "); so = sc.nextInt();

        while(true){
            tong += so;
            if(tong <= 100){
                System.out.print("Nhap so tiep theo: ");
                so = sc.nextInt();
            }
            else{
                System.out.print("Tong = " + tong);
                break;
            }
        }
    }
}
>>>>>>> af8067ac1a5594f4aa0ffc5adeda0d53a5e70ba6
