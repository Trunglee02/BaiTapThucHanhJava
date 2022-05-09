import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) {
       ArrayList<String> arrListString=new ArrayList<>();
        arrlistString.add("JAVA");
        arrlistString.add("PHP");
        arrlistString.add("C#");
        arrlistString.add("C++");
       
        System.out.println("Các phần tử có trong arrListString là: ");
        for (int i = 0;i< arrlistString.size(); i++){
            System.out.print(arrListString.get(i)+"\t");
        }
    }
}