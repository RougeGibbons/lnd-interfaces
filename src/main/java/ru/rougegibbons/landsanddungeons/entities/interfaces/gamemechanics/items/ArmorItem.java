package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Armor;

/**
 * {@link EquipableItem} interface extension for items representing various armor pieces.
 *
 * @see Item
 * @see EquipableItem
 * @see Armor
 * @since 1.1.3
 */
public interface ArmorItem extends EquipableItem, Armor {
    /**
     * see {@link EquipableItem} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean isArmor() {
        return true;
    }
}
