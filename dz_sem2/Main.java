package dz_sem2;

public class Main { //реализуем методы
    public static void main(String[] args) {
    Market market = new Market();
    Queue queue = new Queue();
    
    queue.joinToQueue("Alice");
    queue.joinToQueue("Bob");
    queue.leaveQueue("Bob");
    
    market.placeOrder("Charlie", "Пицца");
    market.takeOrder("Charlie");
    
    Updater.update(market);
    }
    }