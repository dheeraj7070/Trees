import java.util.Scanner;

public class Utility {
    public static void insert(Scanner sc, BinaryTree b) {
        System.out.println("Do you Want to Insert to the left " + b.value);
        boolean Loption = sc.nextBoolean();

        if (Loption) {
            System.out.println("Enter left Value of  " + b.value);
            int value = sc.nextInt();
            BinaryTree binaryTree = new BinaryTree(value);
            b.left = binaryTree;
            insert(sc, binaryTree);
        }
        System.out.println("Do you Want to Insert to the Right " + b.value);
        boolean Roption = sc.nextBoolean();

        if (Roption) {
            System.out.println("Enter Right Value of  " + b.value);
            int value = sc.nextInt();
            BinaryTree binaryTree = new BinaryTree(value);
            b.right = binaryTree;
            insert(sc, binaryTree);
        }
    }
}
