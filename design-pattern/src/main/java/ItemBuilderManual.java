import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class ItemBuilderManual {
    private String id;
    private Long userId;
    private Double priceUsd;
    private Double price;
    private String title;
    private String status;
    private Integer salesQuantity;
    private Double originalPrice;
    private String categoryId;
    private LocalDate dateCreated;
    private Boolean acceptPaypal;

    // Copiamos lo de arriba y nos creamos los
    // metodos para aplicar el builder
    public ItemBuilderManual id(String id) {
        this.id = id;
        return this;
    }

    public ItemBuilderManual userId(Long userId) {
        this.userId = userId;
        return this;
    }

    public ItemBuilderManual priceUsd(Double priceUsd) {
        this.priceUsd = priceUsd;
        return this;
    }

    public ItemBuilderManual price(Double price) {
        this.price = price;
        return this;
    }

    public ItemBuilderManual title(String title) {
        this.title = title;
        return this;
    }

    public ItemBuilderManual status(String status) {
        this.status = status;
        return this;
    }

    public ItemBuilderManual salesQuantity(
            Integer salesQuantity) {
        this.salesQuantity = salesQuantity;
        return this;
    }

    public ItemBuilderManual originalPrice(
            Double originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }

    public ItemBuilderManual categoryId(
            String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public ItemBuilderManual dateCreated(
            LocalDate dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public ItemBuilderManual acceptPaypal(
            Boolean acceptPaypal) {
        this.acceptPaypal = acceptPaypal;
        return this;
    }

    public Item build() {
        return new Item(id, userId, priceUsd,
                price, title, status,
                salesQuantity, originalPrice,
                categoryId, dateCreated,
                acceptPaypal);
    }

    public static ItemBuilderManual builder() {
        return new ItemBuilderManual();
    }
}
