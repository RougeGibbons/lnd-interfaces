package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * interface mixin for {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item}
 * entities that may be stacked by multiple pieces in one item slot in the inventory.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @see ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent.ItemSlot
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers.ItemStorage
 * @since 1.1.3
 */
public interface Stackable {
    /**
     * get stack id (similar stackables have similar stack ids).
     *
     * @return entity stack id.
     */
    @NotNull Long getStackId();

    /**
     * get current stack size.
     *
     * @return current stack size.
     */
    @NotNull Integer getStackSize();

    /**
     * get maximal number of stackables of this kind allowed in a single item slot.
     *
     * @return maximal stack size allowed.
     */
    @NotNull Integer getStackCap();

    /**
     * add given amount of pieces in stack.
     *
     * @param amount - number of pieces to add.
     */
    void increaseStack(@NotNull Integer amount);

    /**
     * remove given amount of pieces from stack.
     *
     * @param amount - number of pieces to remove.
     */
    void decreaseStack(@NotNull Integer amount);
}
