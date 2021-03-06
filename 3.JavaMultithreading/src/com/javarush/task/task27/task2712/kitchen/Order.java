package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

import static com.javarush.task.task27.task2712.ConsoleHelper.*;

public class Order {

    private final Tablet tablet;

    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        initDishes();
    }

    public int getTotalCookingTime() {
        return dishes.stream().mapToInt(Dish::getDuration).sum();
    }

    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }

    protected void initDishes() throws IOException {
        dishes = getAllDishesForOrder();
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()) {
            return "";
        } else {
            return String.format("Your order: %s of %s", dishes.toString(), tablet.toString());
        }
    }
}
