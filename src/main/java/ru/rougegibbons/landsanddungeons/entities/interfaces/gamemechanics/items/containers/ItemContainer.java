package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item;

/**
 * {@link GameEntity} extension for any entities used for containing items (bags, equipment, etc.).
 *
 * @see GameEntity
 * @see Item
 * @see GameEntityStorageComponent.ItemSlot
 * @since 1.1.3
 */
public interface ItemContainer extends GameEntity {
    /**
     * get item stored in the slot under given index.
     *
     * @param slotIndex - index of the slot to get the item from.
     * @return - {@link Item} instance stored in the given slot or null if slot is empty or given index is invalid.
     */
    default @Nullable Item getItem(@NotNull Integer slotIndex) {
        final GameEntityStorageComponent.ItemSlot slot = getSlot(slotIndex);
        return slot == null ? null : slot.getStored();
    }

    /**
     * get item slot from the bag by given slot index.
     *
     * @param slotIndex - index of the slot to get.
     * @return {@link GameEntityStorageComponent.ItemSlot} instance if index is valid, null otherwise.
     */
    @Nullable GameEntityStorageComponent.ItemSlot getSlot(@NotNull Integer slotIndex);

    /**
     * puts given item in the first free slot found.
     *
     * @param item - item to put (may be null in some cases).
     */
    void putItem(@Nullable Item item);

    /**
     * puts given item in the slot under given index (if it's free and index is valid).
     *
     * @param slotIndex - index of the slot to put the item in.
     * @param item      - item to put (may be null in some cases).
     */
    void putItem(@NotNull Integer slotIndex, @Nullable Item item);

    /**
     * removes item from the slot by given slot index.
     *
     * @param slotIndex - index of the slot to clear.
     */
    void discardItem(@NotNull Integer slotIndex);

    /**
     * swaps contents of two inventory slots by given indices if both of them are valid.
     *
     * @param fromSlot - index of the first slot to swap ("source").
     * @param toSlot   - index of the second slot to swap ("target").
     */
    void swapItems(@NotNull Integer fromSlot, @NotNull Integer toSlot);

    /**
     * swaps contents of given {@link GameEntityStorageComponent.ItemSlot} and bag's slot under given index.
     *
     * @param fromSlot - {@link GameEntityStorageComponent.ItemSlot} instance ("source").
     * @param toSlot   - target slot.
     */
    void swapItems(@NotNull GameEntityStorageComponent.ItemSlot fromSlot, @NotNull Integer toSlot);
}
