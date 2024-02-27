package dz_sem2;

public interface MarketBehaviour {
    public void placeOrder(Order order);
    Order takeOrder();
    boolean hasOrder();
}
    public void update() {
        
    } void update() {
          if(hasOrder()){
            Order order = takeOrder();
            System.out.println("заказ обработан" + order.toString());
        }
            else{
                System.out.println("очередь заказов пуста");  
            }
        }