import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Item> cart = new ArrayList<>();

    public void addToCart(Item item) {
        cart.add(item);
    }

    public String showCart() {
        if (cart.isEmpty()) {
            return "The purchase list is empty";
        }

        StringBuilder sb = new StringBuilder();

        cart.forEach(s -> sb.append(String.format("%s%n", s)));

        Double amt = cart.stream()
                .map(Item::price)
                .reduce(0.0, Double::sum);

        return sb.append(String.format("Total sum: $%.2f", amt)).toString();
    }
}
