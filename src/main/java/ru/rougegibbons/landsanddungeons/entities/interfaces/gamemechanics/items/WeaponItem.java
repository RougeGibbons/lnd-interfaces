package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Weapon;

/**
 * {@link EquipableItem} interface extension for items that are various weapons.
 *
 * @see EquipableItem
 * @see Item
 * @see Weapon
 * @since 1.1.3
 */
public interface WeaponItem extends EquipableItem, Weapon {
    /**
     * see {@link EquipableItem} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean isWeapon() {
        return true;
    }
}
