package trees;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(8, -1, null);
        tree.insert(10, 0, tree.getRoot());
        tree.insert(22, 0, tree.getRoot());
        tree.insert(5, 0, tree.getRoot());
        tree.insert(80, 0, tree.getRoot());
        tree.insert(15, 0, tree.getRoot());
        tree.insert(1, 3, tree.getRoot());
        tree.insert(3, 3, tree.getRoot());
        tree.insert(7, 3, tree.getRoot());
        tree.insert(9, 3, tree.getRoot());

        tree.print(tree.getRoot());
    }
    
}
