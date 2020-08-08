import java.util.Scanner;

public class Application {

//    public boolean checkEven(int num){
//        if (num % 2 == 0){
//            return true;
//        }else{
//            return false;
//        }
//    }

    public static void main(String[] args) {
//        Application app = new Application();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
//        boolean result = app.checkEven(num);
        if (num % 2 == 0){
            System.out.println("Given number is Even");
        }else{
            System.out.println("Given number is Odd");
        }
    }
}
