package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.collections.ItemStorageAggregatorComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item;

/**
 * {@link ItemStorage} extension representing character's bank, which can store items itself,
 * but also has several extension slot to put bag there.
 *
 * @see ItemStorage
 * @see ItemStorageAggregatorComponent
 * @see Item
 * @since 1.1.3
 */
public interface CharacterBank extends ItemStorage {
    @NotNull ItemStorageAggregatorComponent.BankExtensionsComponent getExtensions();

    /**
     * put given item into the given extension bag.
     *
     * @param toPut       - {@link Item} instance to put or null.
     * @param extensionId - index of the extension bag to put the item into.
     */
    default void putItem(@Nullable Item toPut,
                         @NotNull Integer extensionId) {
        getExtensions().putItem(toPut, extensionId);
    }

    /**
     * put given item into the given slot of the given extension bag.
     *
     * @param toPut       - {@link Item} instance to put or null.
     * @param extensionId - index of the extension bag to put the item into.
     * @param slotIndex   - index of the slot in the extension bag to put the item into.
     */
    default void putItem(@Nullable Item toPut,
                         @NotNull Integer extensionId,
                         @NotNull Integer slotIndex) {
        getExtensions().putItem(toPut, extensionId, slotIndex);
    }
}
