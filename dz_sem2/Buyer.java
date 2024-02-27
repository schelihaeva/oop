package dz_sem2;

public class Buyer implements MarketBehaviour, QueueBehaviour {
    @Override
public void enqueue(Buyer buyer){
    Object queue;
    ((Object) queue).add(buyer);
}
@Override
public Buyer dequeue(){
    return queue.poll();
}
@Override
public boolean isEmpty(){
    return queue.isEmpty();
}
@Override
public int size(){
    return queue.size();
}
}
