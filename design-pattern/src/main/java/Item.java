import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
@Builder
public class Item {
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

    public Item(String id, Long userId,
                Double priceUsd, Double price,
                String title, String status,
                Integer salesQuantity,
                Double originalPrice,
                String categoryId,
                LocalDate dateCreated,
                Boolean acceptPaypal) {
        this.id = id;
        this.userId = userId;
        this.priceUsd = priceUsd;
        this.price = price;
        this.title = title;
        this.status = status;
        this.salesQuantity = salesQuantity;
        this.originalPrice = originalPrice;
        this.categoryId = categoryId;
        this.dateCreated = dateCreated;
        this.acceptPaypal = acceptPaypal;
    }
}
