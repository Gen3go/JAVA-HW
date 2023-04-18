/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации 
можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации 
можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

public class Computer {
    int price;
    boolean availability;
    String OS;
    String color;

    Computer(int price, boolean availability, String OS, String color){
        this.price = price;
        this.availability = availability;
        this.OS = OS;
        this.color = color;
    }
    public String toString(){
        return "Computer{" +
                "price='" + price + '\'' +
                ", availability='" + availability + '\'' +
                ", OS= '" + OS + '\'' +
                ", color '" + color + '\'' +
                '}';
    }

}
