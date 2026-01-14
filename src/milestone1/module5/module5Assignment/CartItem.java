package milestone1.module5.module5Assignment;

/**
 * Represents an individual product in the shopping system.
 * Handles item details, quantity adjustments, and sub-total calculations.
 * I have marked productId, name, and unitPrice as final to satisfy the immutability requirement
 * and ensure that a product's identity and price remain constant and secure throughout the shopping session.
 */
public class CartItem {
    private final int productId;
    private final String name;
    private final double unitPrice;
    private int quantity;
    private boolean addedToCart;

    /**
     * Constructs a new CartItem with a random ID and validated price.
     * @param name Name of the product.
     * @param unitPrice Cost per single unit.
     */
    public CartItem(String name, double unitPrice) {
        this.productId = (int) (Math.random() * 1000);
        this.name = name;

        // Ensure price is non-negative
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        } else {
            this.unitPrice = 0.0;
            System.out.println("Warning: Invalid price for " + name + ". Set to 0.0");
        }

        // Default state: not in cart with 0 quantity
        this.quantity = 0;
        this.addedToCart = false;
    }


    /**
     * Increases the item count by one.
     */
    public void incrementQuantity() {
        this.quantity++;
    }


    /**
     * Decreases the item count by one.
     * As per requirements, the quantity will not drop below 1.
     * To remove an item entirely, use the toggle/remove feature.
     */
    public void decrementQuantity() {
        if (!this.addedToCart) {
            System.out.println("Item is not in the cart.");
            return;
        }

        // Wrong Way
//        if (this.quantity > 1) {
//            this.quantity--;
//        } else {
//            // Remove item from cart if it hits zero
//            this.addedToCart = false;
//            this.quantity = 0;
//            System.out.println(this.name + " reached 0 and was removed from cart.");
//        }


        /**
         * Right way
         * CHANGE: Only subtract if it results in at least 1
         * By fixing the decrementQuantity method, I am ensuring that:
         * Case 6 (Decrement) is strictly for adjusting numbers.
         * Case 1-3 (Toggle) is strictly for adding/removing.
         */
        if (this.quantity > 1) {
            this.quantity--;
        } else {
            // Just inform the user; do NOT set to 0 or false
            System.out.println("Minimum quantity reached. To Remove " + this.name + ", please use the selection menu.");
        }

    }


    // --- Getters and Setters ---

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getUnitPrice() { return unitPrice; }


    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public boolean isAddedToCart() { return addedToCart; }
    public void setAddedToCart(boolean addedToCart) {
        this.addedToCart = addedToCart;
    }


    /**
     * Calculates the total cost for this specific line item (Price * Quantity).
     * @return Sub-total for this item.
     */
    public double getItemTotal() {
        return  this.unitPrice * this.quantity;
    }
}
