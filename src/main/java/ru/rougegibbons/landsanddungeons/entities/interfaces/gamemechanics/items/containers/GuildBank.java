package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.collections.ItemStorageAggregatorComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.number.mutable.CashComponent;

/**
 * {@link ItemStorage} interface extension representing
 * guild's bank contents, namely, items and cash.
 *
 * @see ItemStorage
 * @see CashComponent
 * @since 1.1.3
 */
public interface GuildBank extends ItemStorage {
    /**
     * get extension slots.
     *
     * @return {@link ItemStorageAggregatorComponent.BankExtensionsComponent} storing extension slots data.
     */
    @NotNull ItemStorageAggregatorComponent.BankExtensionsComponent getExtensions();

    /**
     * get guild's cash data.
     *
     * @return {@link CashComponent} instance storing guild cash's data.
     */
    @NotNull CashComponent getCash();
}
