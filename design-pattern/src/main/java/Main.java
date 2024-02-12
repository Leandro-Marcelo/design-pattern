import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // ? No requiere recordar los nombres de
        // ? los parámetros y de los tipos ❌
        // ? No requiere recordar el orden de los
        // ? parámetros ❌
        Item item = new Item("1", 2L,
                20.0,
                10.0, "Camisa", "ACTIVE", 10,
                30.0, "1", LocalDate.now(),
                true);

        // ? No requiere recordar los nombres de
        // ? los parámetros y de los tipos ✔
        // ? No requiere recordar el orden de los
        // ? parámetros ✔
        Item itemWDesignPattern = Item
                .builder()
                .price(10.0)
                .id("1")
                .userId(2L)
                .title("Camisa")
                .status("ACTIVE")
                .salesQuantity(10)
                .originalPrice(30.0)
                .categoryId("1")
                .dateCreated(LocalDate.now())
                .acceptPaypal(true)
                .priceUsd(20.0)
                .build();

        System.out.println(
                item.toString());
        System.out.println(
                itemWDesignPattern.toString());
    }
}
