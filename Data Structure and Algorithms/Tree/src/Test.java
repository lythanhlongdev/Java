import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.Scanner;

public class Test {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int c = sum(10, 20);
        System.out.println(c);
        Scanner sc = new Scanner(System.in);

    }
}