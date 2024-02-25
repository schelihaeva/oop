package oop.dz_sem1;

class Coffee extends HotDrink {
    @Override //показатель полиморфизма, проверяет есть ли этот метод в классе родителя
    public void makeTemperature() {
    System.out.println("Осторожно!!!Горячий! 65 градусов");
    }
    
    @Override
    public void volume() {
    System.out.println("Кофе объемом 200мл");
    }
    }
