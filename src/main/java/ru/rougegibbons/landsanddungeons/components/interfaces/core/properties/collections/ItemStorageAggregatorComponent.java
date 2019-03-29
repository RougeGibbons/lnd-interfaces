package ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.collections;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.ListProviderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers.ItemStorage;

import java.util.Objects;

/**
 * {@link ListProviderComponent} extension used to
 * aggregate {@link ItemStorage} instances into
 * a single inventory and control it.
 *
 * @param <T> - {@link GameEntityStorageComponent.BagSlot} interface implementations.
 * @see ListProviderComponent
 * @see GameEntityStorageComponent.BagSlot
 * @see Item
 * @since 1.1.3
 */
public interface ItemStorageAggregatorComponent<T extends GameEntityStorageComponent.BagSlot> extends
        ListProviderComponent<T> {
    /**
     * get storage by given index.
     *
     * @param storageIndex - index of the storage to get.
     * @return {@link ItemStorage} instance if the index is valid and given slot is not empty, null otherwise.
     */
    default @Nullable ItemStorage getStorage(@NotNull Integer storageIndex) {
        final boolean indexValid = storageIndex >= 0 && storageIndex < size();
        return indexValid && get(storageIndex) != null
                ? get(storageIndex).getStored() : null;
    }

    /**
     * counts totat free slots in the inventory.
     *
     * @return total free slots amount in all bags used by the character.
     */
    default @NotNull Integer getTotalFreeSlots() {
        Integer freeSlots = 0;

        for (GameEntityStorageComponent.BagSlot bag : this) {
            if (!bag.isEmpty()) {
                freeSlots += Objects.requireNonNull(bag.getStored()).getFreeSlots();
            }
        }

        return freeSlots;
    }

    /**
     * swaps items between two item slots. Slots may be in different bags and may be empty.
     *
     * @param fromBag  - "source" bag.
     * @param fromSlot - slot index in the source bag.
     * @param toBag    - "target" bag.
     * @param toSlot   - slot index in the target bag.
     */
    default void swap(@NotNull Integer fromBag,
                      @NotNull Integer fromSlot,
                      @NotNull Integer toBag,
                      @NotNull Integer toSlot) {
        if (fromBag.equals(toBag)) {
            swap(fromBag, fromSlot, toSlot);
        } else {
            final Boolean fromIndexValid = fromBag >= 0 && fromBag < size();
            final Boolean toIndexValid = toBag >= 0 && toBag < size();
            if (fromIndexValid && toIndexValid) {
                if (!get(fromBag).isEmpty() && !get(toBag).isEmpty()) {
                    final ItemStorage sourceBag = get(fromBag).getStored();
                    final Boolean fromSlotValid = fromSlot >= 0
                            && fromSlot < Objects.requireNonNull(sourceBag).getSize();
                    final ItemStorage targetBag = get(toBag).getStored();
                    final Boolean toSlotValid = toSlot >= 0
                            && toSlot < Objects.requireNonNull(targetBag).getSize();
                    if (fromSlotValid && toSlotValid) {
                        targetBag.swapItems(Objects.requireNonNull(
                                sourceBag.getSlot(fromSlot)), toSlot);
                    }
                }
            }
        }
    }

    /**
     * swaps the contents of two item slots. Both slots belong to one bag.
     *
     * @param bagIndex - bag index to perform the swap in.
     * @param fromSlot - "source" slot.
     * @param toSlot   - "target" slot.
     */
    @SuppressWarnings("Duplicates")
    default void swap(@NotNull Integer bagIndex,
                      @NotNull Integer fromSlot,
                      @NotNull Integer toSlot) {
        if (bagIndex >= 0 && bagIndex < size() && !get(bagIndex).isEmpty()) {
            final ItemStorage bag = get(bagIndex).getStored();
            final Boolean fromSlotValid = fromSlot >= 0
                    && fromSlot < Objects.requireNonNull(bag).getSize();
            final Boolean toSlotValid = toSlot >= 0
                    && toSlot < Objects.requireNonNull(bag).getSize();
            if (fromSlotValid && toSlotValid) {
                bag.swapItems(fromSlot, toSlot);
            }
        }
    }

    /**
     * gets the item from the given slot of the given bag if such bag and slot exist in the inventory.
     *
     * @param bagIndex  - index of the bag to get the item from.
     * @param itemIndex - index of the slot in the bag to get the item from.
     * @return {@link Item} instance if both indices are valid and item slot is not empty, null otherwise.
     */
    default @Nullable Item getItem(@NotNull Integer bagIndex,
                                   @NotNull Integer itemIndex) {
        if (bagIndex >= 0 && bagIndex < size()) {
            final ItemStorage bag = get(bagIndex).getStored();
            if (bag != null) {
                return bag.getItem(itemIndex);
            }
        }
        return null;
    }

    /**
     * get item slot of the given bag by given index.
     *
     * @param bagIndex  - index of the bag to get the slot from.
     * @param slotIndex - index of the slot to get from the bag.
     * @return {@link GameEntityStorageComponent.ItemSlot} instance if both indices are valid, null otherwise.
     */
    default @Nullable GameEntityStorageComponent.ItemSlot getSlot(@NotNull Integer bagIndex,
                                                                  @NotNull Integer slotIndex) {
        if (bagIndex >= 0 && bagIndex < size()) {
            final ItemStorage bag = get(bagIndex).getStored();
            if (bag != null) {
                return bag.getSlot(slotIndex);
            }
        }
        return null;
    }

    /**
     * puts the item in the inventory if there're free slots. First free slot found is used to put the item in.
     *
     * @param toPut - {@link Item} to put in the inventory.
     */
    default void putItem(@Nullable Item toPut) {
        for (GameEntityStorageComponent.BagSlot bag : this) {
            if (bag.getStored() != null) {
                if (!bag.getStored().isFull()) {
                    bag.getStored().putItem(toPut);
                    break;
                }
            }
        }
    }

    /**
     * puts the item in given slot of given bag if it's empty and both indices are valid..
     *
     * @param toPut     - {@link Item} to put
     * @param bagIndex  - index of the bag to put the item in.
     * @param slotIndex - index of the item slot to put the item in.
     */
    default void putItem(@Nullable Item toPut,
                         @NotNull Integer bagIndex,
                         @NotNull Integer slotIndex) {
        if (bagIndex >= 0 && bagIndex < size()) {
            final ItemStorage bag = get(bagIndex).getStored();
            if (bag != null) {
                if (slotIndex >= 0 && slotIndex < bag.getSize()) {
                    bag.putItem(slotIndex, toPut);
                }
            }
        }
    }

    /**
     * put given item in the bag under given index.
     *
     * @param toPut    - {@link Item} to put, or null.
     * @param bagIndex - index of the bag to put the item in.
     */
    default void putItem(@Nullable Item toPut,
                         @NotNull Integer bagIndex) {
        if (bagIndex >= 0 && bagIndex < size()) {
            final ItemStorage bag = get(bagIndex).getStored();
            if ((bag != null) && (toPut == null || !bag.isFull())) {
                bag.putItem(toPut);
            }
        }
    }

    /**
     * removes item from the given slot of the given bag if both indices are valid.
     *
     * @param bagIndex  - index of the bag to remove the item from.
     * @param slotIndex - index of the slot in the bag to remove the item from.
     */
    default void discardItem(@NotNull Integer bagIndex,
                             @NotNull Integer slotIndex) {
        if (bagIndex >= 0 && bagIndex < size()) {
            final ItemStorage bag = get(bagIndex).getStored();
            if (bag != null) {
                bag.discardItem(slotIndex);
            }
        }
    }

    /**
     * {@link ItemStorageAggregatorComponent} interface extension representing character's inventory.
     *
     * @see ItemStorageAggregatorComponent
     * @see GameEntityStorageComponent.BagSlot
     * @since 1.1.3
     */
    interface InventoryComponent extends
            ItemStorageAggregatorComponent<GameEntityStorageComponent.BagSlot> {

    }

    /**
     * {@link ItemStorageAggregatorComponent} interface extension representing character bank's extensions.
     *
     * @see ItemStorageAggregatorComponent
     * @see GameEntityStorageComponent.BankBagSlot
     * @since 1.1.3
     */
    interface BankExtensionsComponent extends
            ItemStorageAggregatorComponent<GameEntityStorageComponent.BankBagSlot> {
        /**
         * check if the extension is unlocked already.
         *
         * @param extensionId - number of the extension slot to check.
         * @return true if the slot is already unlocked.
         */
        default @NotNull Boolean isUnlocked(@NotNull Integer extensionId) {
            return (extensionId >= 0 && extensionId <= size())
                    && (get(extensionId) == null ? false : get(extensionId).isUnlocked());
        }

        /**
         * get extension slot unlocking price.
         *
         * @param extensionId - number of the extension slot to get the price.
         * @return extension slot unlocking price.
         */
        default @NotNull Integer getUnlockingPrice(@NotNull Integer extensionId) {
            return (extensionId < 0 || extensionId >= size())
                    ? -1 : get(extensionId) != null
                    ? get(extensionId).getUnlockingPrice() : -1;
        }

        /**
         * unlock extension slot under given index.
         *
         * @param extensionId - index of the extension to unlock.
         */
        default void unlock(@NotNull Integer extensionId) {
            if (extensionId >= 0 && extensionId < size()) {
                if ((get(extensionId) != null) && !get(extensionId).isUnlocked()) {
                    get(extensionId).unlock();
                }
            }
        }
    }
}
