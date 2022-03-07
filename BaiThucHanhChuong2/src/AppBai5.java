import java.util.Scanner;

public class AppBai5 {
    private static Scanner a = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n ,sum =0; 
        do{
             
		System.out.print("nhập số nguyên: ");
			  n=a.nextInt();
			sum+=n;
        }
      while( sum < 100);
		System.out.println("tổng các số vừa nhập là: "+sum);
    }
}
