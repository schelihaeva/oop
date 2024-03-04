package dz_sem2;

// Интерфейс для работы с магазином
interface MarketBehaviour {
// Метод для размещения заказа человеком в магазине
void placeOrder(String person, String order);

// Метод для получения заказа человеком из магазина
void takeOrder(String person);
}