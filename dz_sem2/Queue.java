package dz_sem2;

import java.util.LinkedList;

// Класс, представляющий очередь в магазине
class Queue implements QueueBehaviour {
    private LinkedList<String> queue = new LinkedList<>();
    
    @Override
    public void joinToQueue(String person) { // принимает человека в очередь
    queue.add(person); // когда имя человека появляется, то он встает в конец очереди
    System.out.println(person + " встал в очередь");
    }
    
    @Override
    public void leaveQueue(String person) { // описывает метод,когда чн\еловек покидает очередь
    if (queue.remove(person)) { // если имя человека находится в списке, то его удаляем из очереди
    System.out.println(person + " покинул очередь");
    } else { // в противном случае человек не был в очереди
    System.out.println(person + " не был в очереди");
    }
    }
    }