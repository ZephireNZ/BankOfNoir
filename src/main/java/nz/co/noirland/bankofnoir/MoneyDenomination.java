package nz.co.noirland.bankofnoir;

import org.bukkit.Material;

public class MoneyDenomination implements Comparable<MoneyDenomination> {

    private final Material material;
    private final double value;

    /**
     * Simple datastructure representing a denomination in terms of a item material
     * @param material item type
     * @param value value for 1 item of specified type
     */
    public MoneyDenomination(Material material, double value) {
        this.material = material;
        this.value = value;
    }

    public Material getMaterial() {
        return material;
    }

    public double getValue() {
        return value;
    }

    @Override
    public int compareTo(MoneyDenomination o) {
        return Double.compare(getValue(), o.getValue());
    }
}
