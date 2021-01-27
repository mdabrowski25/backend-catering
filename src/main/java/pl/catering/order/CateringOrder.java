package pl.catering.order;

import org.springframework.format.annotation.DateTimeFormat;
import pl.catering.drink.Drink;
import pl.catering.food.Food;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
public class CateringOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String firstname;
    private String lastname;
    @OneToMany
    private List<Drink> drinkOrdered;
    @OneToMany
    private List<Food> foodOrdered;
    private double price;
    private String address;
    private String telephoneNumber;
    private String date;

    public CateringOrder(String firstname, String lastname, List<Drink> drinkOrdered, List<Food> foodOrdered,
                         double price, String address, String telephoneNumber, String date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.drinkOrdered = drinkOrdered;
        this.foodOrdered = foodOrdered;
        this.price = price;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.date = date;
    }

    public CateringOrder() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    public List<Drink> getDrinkOrdered() {
        return drinkOrdered;
    }

    public void setDrinkOrdered(List<Drink> drinkOrdered) {
        this.drinkOrdered = drinkOrdered;
    }

    public double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public List<Food> getFoodOrdered() {
        return foodOrdered;
    }

    public void setFoodOrdered(List<Food> foodOrdered) {
        this.foodOrdered = foodOrdered;
    }
}
