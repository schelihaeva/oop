// package oop.dz_sem1;

// public class Tea {
    
// }
package oop.dz_sem1;

class Tea extends HotDrink {
    @Override //показатель полиморфизма, проверяет есть ли этот метод в классе родителя
    public void makeTemperature() {
    System.out.println("Осторожно!!! Горячий! 60 градусов");
    }
    
    @Override
    public void volume() {
    System.out.println("Чай объемом 250мл");
    }
    }
