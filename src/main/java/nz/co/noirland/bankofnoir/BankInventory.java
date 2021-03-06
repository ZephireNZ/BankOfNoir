package nz.co.noirland.bankofnoir;

import org.bukkit.inventory.Inventory;

/**
 * Simple data structure used to hold an bank inventory owned by a certain owner.
 * @param <T> The type of owner this BankInventory represents
 */
public class BankInventory<T> {

    private final T owner;
    private final Inventory bank;
    private Double remainder;

    /**
     * Constructs a new BankInventory for given owner.
     * @param owner The owner of the bank inventory
     * @param bank The Inventory that stores their balance represented as items
     * @param remainder The balance that cannot be converted into items (or fit into the Inventory)
     */
    public BankInventory(T owner, Inventory bank, Double remainder) {
        this.owner = owner;
        this.bank = bank;
        this.remainder = remainder;
    }

    public T getOwner() {
        return owner;
    }

    public Inventory getBank() {
        return bank;
    }

    public Double getRemainder() {
        return remainder;
    }

    public void setRemainder(Double remainder) {
        this.remainder = remainder;
    }
}
