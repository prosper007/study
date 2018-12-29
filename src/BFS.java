
/*
import org.w3c.dom.Node;

import java.util.PriorityQueue;

public class BFS {
    static void search(Node n){
        PriorityQueue queue = new PriorityQueue();
        queue.enqueue(n);
        while (!queue.isEmpty()){
            Node p = queue.dequeue();
            visit(p);
            for (Node q : p.adjacent) {
                if(!n.marked){
                    n.marked = true;
                    queue.enqueue(q);
                }
            }

        }
    }
}
*/
