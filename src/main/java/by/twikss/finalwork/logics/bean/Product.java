package by.twikss.finalwork.logics.bean;

import by.twikss.finalwork.logics.enums.Category;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Data
@Builder
public class Product {
    private long id;
    private String name;
    private BigDecimal price;
    private Category category;
    private BigDecimal discount;
    private String description;

    public BigDecimal getPriceWithDiscount(){
        if (discount != null){
            return BigDecimal.valueOf(price.doubleValue() - price.doubleValue() * discount.doubleValue());
        } else {
            return price;
        }

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", discount=" + discount +
                ", description='" + description + '\'' + " actual price =" + getPriceWithDiscount().setScale(2, RoundingMode.HALF_UP) +
                '}';
    }
}
