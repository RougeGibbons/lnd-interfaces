package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.prototypes.ItemPrototype;

/**
 * {@link GameEntity} interface extension represinting basic interface for various ingame items,
 * usable, stackable, equipable and not, quest items, etc.
 *
 * @see GameEntity
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Stackable
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Usable
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Equipable
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Armor
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins.Weapon
 * @since 1.1.3
 */
public interface Item extends GameEntity {
    /**
     * checks if the item is stackable.
     *
     * @return true if the entity implements Stackable interface, false otherwise.
     */
    default @NotNull Boolean isStackable() {
        return false;
    }

    /**
     * checks if the item is usable.
     *
     * @return true if the entity implements Usable interface, false otherwise.
     */
    default @NotNull Boolean isUsable() {
        return false;
    }

    /**
     * checks if the item is equipable.
     *
     * @return true if the entity implements Equipable interface, fasle otherwise.
     */
    default @NotNull Boolean isEquipable() {
        return false;
    }

    /**
     * get item prototype it was instantiated from.
     *
     * @return {@link ItemPrototype} instance.
     */
    @NotNull ItemPrototype getPrototypeData();
}
