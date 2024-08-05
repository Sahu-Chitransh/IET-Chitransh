import java.util.Scanner;
public class Array_Print {
    public static void main(String[] args) {
        
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array : ");
    for(int i=0;i<5;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter Index : ");
    System.out.println("Given Index : "+arr[sc.nextInt()]);

    }
}