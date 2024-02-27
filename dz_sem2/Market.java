package dz_sem2;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements  QueueBehaviour {
    private Buyer buyer;
    private Queue orders;

public Market(){
    Queue queue = new LinkedList<>();
    Order order = new Order();
}
//

public void placeOrder() {
}

public void update() {
}

public String dequeue() {
    return null;
}


}
