
import java.awt.font.NumericShaper;

class SegmentTree {

    private static class Node {

        int data;
        Node left;
        Node right;
        int startInterval;
        int endInterval;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    public SegmentTree() {

    }

    private Node root;

    private void sum(int sum) {
        root = sum(data, 0, nums.length);
    }

    public int sum(int data, int startInterval, int endInterval) {

    }
}
