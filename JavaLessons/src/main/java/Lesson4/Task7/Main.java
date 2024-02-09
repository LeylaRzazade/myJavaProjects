package Lesson4.Task7;
/*
7. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
 информацию об аттракционах, времени их работы и стоимости.
*/

public class Main {
    public static void main(String[] args) {
        Park park = new Park(3);

        park.addAttraction("Roller Coaster", "10:00 AM - 6:00 PM", 25.0);
        park.addAttraction("Carousel", "9:00 AM - 5:00 PM", 10.0);
        park.addAttraction("KING KONG", "11:00 AM - 7:00 PM", 25.0);

        park.displayAttractions();
    }
}
