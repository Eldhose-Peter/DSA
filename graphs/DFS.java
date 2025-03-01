package graphs;

public class DFS {
    public static void main(String[] args) {
        
        Graph graph = new Graph(6);
        //create vertices
        Node node0 = new Node(0, 3);
        Node node1 = new Node(1, 0);
        Node node2 = new Node(2, 0);
        Node node3 = new Node(3, 1);
        Node node4 = new Node(4, 1);
        Node node5 = new Node(5, 0);

        //create edges by connecting vertices
        node0.addAdjacent(node1);
        node0.addAdjacent(node2);
        node0.addAdjacent(node3);
        node3.addAdjacent(node4);
        node4.addAdjacent(node5);

        // add all the vertices into graph
        graph.addNode(node0);
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        traverse(graph,node0);
    }
    private static void traverse(Graph graph,Node root) {

        if (root == null) {
            return;
        }

        for (Node vertex : graph.getVertices()) {
            vertex.setState(State.UNVISITED);
        }

        System.out.println(root.getValue());

        root.setState(State.VISITED);
        for (Node n : root.getAdjacent()) {
            if (n.getState() == State.UNVISITED) {
                traverse(graph,n);
            }
        }
    }
}
