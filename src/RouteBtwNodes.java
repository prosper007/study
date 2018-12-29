import java.util.LinkedList;
import java.util.PriorityQueue;

public class RouteBtwNodes {

    static boolean route(Graph g, Node start, Node end){
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(start);
        start.visited = true;
        while (!queue.isEmpty()){
            Node s = queue.remove();
            if(s == end){
                return true;
            }
            for(Node m : s.children){
                if(!m.visited){
                    queue.add(m);
                    m.visited = true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node zero = new Node();
        zero.num = 0;
        Node one = new Node();
        one.num = 1;
        Node two = new Node();
        two.num = 2;
        Node three = new Node();
        three.num = 3;
        Node four = new Node();
        four.num = 4;
        Node five = new Node();
        five.num = 5;
        Node six = new Node();
        six.num = 6;

        zero.children = new Node[]{one};
        one.children = new Node[]{two};
        two.children = new Node[]{zero, three};
        three.children = new Node[]{two};
        four.children = new Node[]{six};
        five.children = new Node[]{four};
        six.children = new Node[]{five};

        Graph graph = new Graph();
        graph.nodes = new Node[]{one,two,three,four,five,six};
        System.out.println(route(graph, three, three));


    }
}
