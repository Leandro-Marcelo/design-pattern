import java.time.LocalDate;

public class MainSaved {
    public static void main(String[] args) {
        Item camisa = new Item("1", 1L, 10.0,
                20.0, "Camisa", "ACTIVE", 10,
                30.0, "1", LocalDate.now(),
                true);
        Item camisaBuilder = ItemBuilderManual
                .builder()
                .id("1")
                .userId(1L)
                .priceUsd(10.0)
                .price(20.0)
                .title("Camisa")
                .status("ACTIVE")
                .salesQuantity(10)
                .originalPrice(30.0)
                .categoryId("1")
                .dateCreated(LocalDate.now())
                .acceptPaypal(true)
                .build();
        Item camisaBuilderAutomatic = Item
                .builder()
                .id("1")
                .userId(1L)
                .priceUsd(10.0)
                .price(20.0)
                .title("Camisa")
                .status("ACTIVE")
                .salesQuantity(10)
                .originalPrice(30.0)
                .categoryId("1")
                .dateCreated(LocalDate.now())
                .acceptPaypal(true)
                .build();

        Item bicicleta = ItemBuilderManual
                .builder()
                .id("2")
                .priceUsd(100.0)
                .price(100000.0)
                .build();

        System.out.println(
                camisa.toString());
        System.out.println(
                camisaBuilder.toString());
        System.out.println(
                bicicleta.toString());
        System.out.println(
                camisaBuilderAutomatic.toString());
    }
}
