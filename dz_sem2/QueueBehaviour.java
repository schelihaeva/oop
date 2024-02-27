//Реализовать класс Market и все методы, которые он обязан реализовывать.
//Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдаёт заказы)

// Интерфейс для имитирования работы очереди
package dz_sem2;
public interface QueueBehaviour {
       void enqueue(Buyer buyer); //Enqueue — позволяет добавить элемент в конец очереди
       Buyer dequeue; //удаляет человека из очереди
       boolean isEmpty;  // проверяет на пустоту очереди
       int size();// получение размера очереди
    }
   
    // }

    }










































































Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдаёт заказы)

package dz_sem2;

import java.util.Deque;

public class QueueBehaviour {
    
}
