package dz_sem2;

import java.util.LinkedList;
import java.util.Queue;

// Класс, представляющий магазин
class Market implements MarketBehaviour {
    private Queue<String> orders = new LinkedList<>();  // создаем очередь
    
    @Override
    public void placeOrder(String person, String order) { // принимаем два аргумента:человек, который совершает заказ(person) и сам заказ(order)
    orders.add(order);//добавили заказ в очередь с помощью add
    System.out.println(person + " сделал заказ: " + order);
    }
    
    @Override
    public void takeOrder(String person) { // проверяем кол-во заказов у человека
    if (!orders.isEmpty()) { //если у человека еть заказ
    String order = orders.poll(); //то человеку отдаем заказ,извлекаем из очереди, выводим сообщение
    System.out.println(person + " забрал заказ: " + order);
    } else {
    System.out.println("Нет заказов для " + person); // в пртивном случае для человека нет больше заказов
    }
    }
    }