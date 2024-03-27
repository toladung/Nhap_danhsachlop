import java.util.ArrayList;
import java.util.Scanner;

public class Hi {
    public static void main(String[] args) {
        classs a1 = new classs("dung",18);
        classs a2  = new classs("Phong",20);
        classs a3 = new classs("Hoa",20);
        classs a4 = new classs("Hong",23);
        ArrayList<classs> Lop = new ArrayList<>();
        Lop.add(a1);
        Lop.add(a2);
        Lop.add(a3);
        Lop.add(a4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào user name:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào pass:");
        String pass= scanner.nextLine();
        System.out.println("user name : "+ name +"pass :"+ pass);
        if(name.equals("hidungne") && pass.length() >6){
            System.out.println("Danh sách học sinh : ");
            System.out.println(Lop);
        }
    }
}

