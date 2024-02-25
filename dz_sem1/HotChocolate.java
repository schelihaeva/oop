package dz_sem1;

class HotChocolate extends HotDrink {
    @Override //показатель полиморфизма, проверяет есть ли этот метод в классе родителя
    public void makeTemperature() {
    System.out.println("Осторожно!!!Горячий! 70 градусов");
    }
    
    @Override
    public void volume() {
    System.out.println("Кофе объемом 150мл");
    }
    }