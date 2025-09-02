package vendingmachine;

import org.springframework.web.bind.annotation.*;
import vendingmachine.VendingMachine;
import vendingmachine.entity.Item;
import vendingmachine.enums.Coin;

import java.util.Map;

@RestController
@RequestMapping("/api/vending")
public class VendingMachineController {

    private final VendingMachine vendingMachine = VendingMachine.getInstance();

    // ✅ 1. Add item
    @PostMapping("/add-item")
    public Item addItem(@RequestParam String code,
                        @RequestParam String name,
                        @RequestParam int price,
                        @RequestParam int quantity) {
        return vendingMachine.addItem(code, name, price, quantity);
    }

    // ✅ 2. Select item
    @PostMapping("/select-item")
    public String selectItem(@RequestParam String code) {
        vendingMachine.selectItem(code);
        return "Selected item: " + code;
    }

    // ✅ 3. Insert coin
    @PostMapping("/insert-coin")
    public String insertCoin(@RequestParam Coin coin) {
        vendingMachine.insertCoin(coin);
        return "Inserted coin: " + coin + ", Current balance: " + vendingMachine.getBalance();
    }

    // ✅ 4. Dispense item
    @PostMapping("/dispense")
    public String dispense() {
        vendingMachine.dispense();
        return "Dispense process triggered.";
    }

    // ✅ 5. Refund balance
    @PostMapping("/refund")
    public String refund() {
        vendingMachine.refundBalance();
        return "Refund triggered.";
    }

    // ✅ 6. Get current state
    @GetMapping("/state")
    public Map<String, Object> getState() {
        return Map.of(
                "balance", vendingMachine.getBalance(),
                "selectedItem", vendingMachine.getSelectedItem(),
                "inventory", vendingMachine.getInventory()
        );
    }
}
