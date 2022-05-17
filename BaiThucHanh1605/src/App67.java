import java.util.TreeSet;
import java.util.Scanner;
public class App67 {
public static void main(String[] args) {
	int number;
	TreeSet<Integer> treesetinteger =new TreeSet<>();
	Scanner sc=new Scanner(System.in);
	treesetinteger.add(0);
	treesetinteger.add(3);
	treesetinteger.add(1);
	treesetinteger.add(4);
	treesetinteger.add(2);
	treesetinteger.add(8);
	System.out.println("Các phần tử trong treeSetInteger: ");
    System.out.println(treeSetInteger);
    System.out.println("Nhập phần tử cần thêm: ");
	number=sc.nextInt();
	if(!treesetinteger.contains(number)) {
		treesetinteger.add(number);
		System.out.println("Thêm thành công!");
		System.out.println("Các phần tử trong treeSetIntege sau khi thêm: ");
        System.out.println(treeSetInteger);
	}
	else {
		System.out.println("Phần tử " + number + " đã tồn tại!");
	}
    }
}