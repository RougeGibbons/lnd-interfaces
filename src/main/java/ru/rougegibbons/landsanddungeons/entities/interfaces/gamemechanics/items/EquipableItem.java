package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.items.SlotsKindsProviderComponents;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Equipable;

/**
 * {@link Item} interface extension representing generic equipable items.
 *
 * @see Item
 * @see Equipable
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Armor
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Weapon
 * @since 1.1.3
 */
public interface EquipableItem extends Item, Equipable {
    /**
     * see {@link Item} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean isEquipable() {
        return true;
    }

    /**
     * checks if equipable is an armor piece.
     *
     * @return true if the entity implements Armor interface, false otherwise.
     */
    default @NotNull Boolean isArmor() {
        return false;
    }

    /**
     * checks if equipable is a weapon.
     *
     * @return true if the entity implements Weapon interface, false otherwise.
     */
    default @NotNull Boolean isWeapon() {
        return false;
    }

    /**
     * get equipment kind.
     *
     * @return this equipment piece's kind.
     */
    @NotNull Integer getKind();

    /**
     * get character doll slots this item can be equipped in.
     *
     * @return {@link SlotsKindsProviderComponents} instance storing equipable slots set for this item.
     */
    @NotNull SlotsKindsProviderComponents getEquipableSlots();
}
