package vendingmachine.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data

public class Inventory {
    private final Map<String, Item> itemMap = new HashMap<>();
    private final Map<String, Integer> stockMap = new HashMap<>();

    public Map<String, Item> getItemMap() {
        return itemMap;
    }

    public Map<String, Integer> getStockMap() {
        return stockMap;
    }

    public void addItem(String code, Item item, int quantity) {
        itemMap.put(code, item);
        stockMap.put(code, quantity);
    }

    public Item getItem(String code) {
        return itemMap.get(code);
    }

    public boolean isAvailable(String code) {
        return stockMap.getOrDefault(code, 0) > 0;
    }

    public void reduceStock(String code) {
        stockMap.put(code, stockMap.get(code) - 1);
    }



}