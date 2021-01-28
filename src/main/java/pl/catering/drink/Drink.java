package pl.catering.drink;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer drinkId;
    private String name;
    private Integer price;

    public Drink(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Drink() {
    }

    public Integer getDrinkId() {
        return drinkId;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setDrinkId(Integer drinkId) {
        this.drinkId = drinkId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
