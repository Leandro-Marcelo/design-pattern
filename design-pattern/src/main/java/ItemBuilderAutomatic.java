import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
// agregamos solamente este metodo y el resto lo
// copiamos de Item
@Builder
public class ItemBuilderAutomatic {
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
}