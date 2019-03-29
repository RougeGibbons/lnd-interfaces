package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers;

import org.jetbrains.annotations.NotNull;

/**
 * {@link ItemContainer} interface extension for entities representing
 * various item storages: bags, banks, etc.
 *
 * @see ItemContainer
 * @since 1.1.3
 */
public interface ItemStorage extends ItemContainer {
    /**
     * get bag capacity.
     *
     * @return bag capacity.
     */
    @NotNull Integer getSize();

    /**
     * get amount of free slots in the bag.
     *
     * @return number of free slots in current bag.
     */
    @NotNull Integer getFreeSlots();

    /**
     * checks if bag is full.
     *
     * @return true if there're no free slots in the bag, false otherwise.
     */
    default @NotNull Boolean isFull() {
        return getFreeSlots() == 0;
    }

    /**
     * get first free item slot found in the bag.
     *
     * @return first free slot index if there's at least one free slot in the bag, -1 otherwise.
     */
    @NotNull Integer getFirstFreeSlot();
}
