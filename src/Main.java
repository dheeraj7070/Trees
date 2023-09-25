import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Root Value");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
      BinaryTree root = new BinaryTree(value);

      Utility.insert(sc,root);
    }
}