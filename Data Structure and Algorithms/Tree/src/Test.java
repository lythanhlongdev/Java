import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

public class Test {
    public static void main(String[] args) {
       BinarySearchTree x = new BinarySearchTree();
       x.add(50);
       for (int i = 0 ; i <= 100; i++){
          if (i == 50) continue;
          x.add(i);
       }
       x.nodeLeftRight();
    }
}