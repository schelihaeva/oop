package dz_sem2;

public class Order implements MarketBehaviour, QueueBehaviour {
        @Override
        public void placeOrder(Order order){
            Object orders;
            orders.add(order);
        }
        @Override
        public Order takeOrder(){
            Object orders;
            return ((Object) orders).poll();
        }
        @Override
        public boolean hasOrder(){
            Object orders;
            return !((Object) orders).isEmpty();
        }
        @Override
        public void enqueue(Buyer buyer) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
        }
        @Override
        public int size() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'size'");
        }

}


