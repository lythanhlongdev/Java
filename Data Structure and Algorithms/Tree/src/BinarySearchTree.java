import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

public class BinarySearchTree {
    // xuất giá trị node
    private String result = "";

    private class NodeTree {
        private int value;
        private NodeTree tLeft, tRight;

        public NodeTree(int value) {
            this.value = value;
            this.tLeft = this.tRight = null;
        }

        public NodeTree(int value, NodeTree tLeft, NodeTree tRight) {
            this.value = value;
            this.tLeft = tLeft;
            this.tRight = tRight;
        }


    }

    private NodeTree root;

    public BinarySearchTree() {
        this.root = null;
    }

    /*

        Hàm giá trị vào cây. void addNode
        - giá trị thêm vào node mới và node gốc
        - nếu node gốc bằng null return;
        + nếu giá trị node mới lớn hơn giá trị node gốc thì chuyển sang cây phải.
          - nếu cây phải bằng null thì gán cây phải bằng node mới, root.right = newNode
          - ngược lại (khác null) gọi lại hàm addNode chuyên tham số node mơi và chuyển
            node gốc sáng phải. addNode(newNode,root.right)
       + Nếu giá trị node mới nhỏ hơn giá trị node gốc thì chuyển sang cây trái.
         - nếu cây trái bằng null thì gán cây trái bằng node mới, root.left = newNode
         - ngược lại (khác null) gọi lại hàm addNode tham số node mới và chuyển node gốc
           sang trái.addNode(newNode, root.left)

    */
    private void addNode(NodeTree newNode, NodeTree rootExplore) {
        // node gốc bằng null dừng hàm
        if (rootExplore == null) {
            return;
        }
        // nếu giá trị node mơi lớn hơn node gốc
        if (newNode.value > rootExplore.value) {
            // nếu node gốc
            if (rootExplore.tRight == null) {
                rootExplore.tRight = newNode;
            } else {
                addNode(newNode, rootExplore.tRight);
            }
        }
        if (newNode.value < rootExplore.value) {
            if (rootExplore.tLeft == null) {
                rootExplore.tLeft = newNode;
            } else {
                addNode(newNode, rootExplore.tLeft);
            }
        }
    }

    public void add(int value) {
        NodeTree newNode = new NodeTree(value);
        try {
            if (this.root == null) {
                root = newNode;
                return;
            }
            addNode(newNode, root);
        } catch (Exception e) {
            e.toString();
        }
    }

    // duyệt cây theo node left right
    private void nLeftRight(NodeTree value) {
        if(value == null) return;
        System.out.println(value.value);
        nLeftRight(value.tLeft);
        nLeftRight(value.tRight);
    }

    public void nodeLeftRight(){
        nLeftRight(this.root);
    }
}
