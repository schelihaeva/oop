package dz_sem2;

public class Main {
    public static void main(String[]args){
        Market market = new Market();
        Buyer buyer1 = new Buyer();
        Buyer buyer2 = new Buyer();
        Buyer buyer3 = new Buyer();

        market.enqueue(buyer1);
        market.enqueue(buyer2);
        market.enqueue(buyer3);

        System.out.println("размер очереди: " + market.size());
        System.out.println("первый человек в очереди:" + market.dequeue());
        System.out.println("размер очереди после удаления: " + market.size());

        Order order1 = new Order();
        Order order2 = new Order();

        market.placeOrder();
        market.placeOrder();

        market.update();
        market.update();
        market.update();
        market.update();


    }
    
}
