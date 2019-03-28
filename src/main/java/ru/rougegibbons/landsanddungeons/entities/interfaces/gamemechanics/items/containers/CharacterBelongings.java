package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.collections.ItemStorageAggregatorComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.number.mutable.CashComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;

/**
 * {@link GameEntity} interface extension representing user character's belongings aggregator.
 * Includes bank, bags, equipment and money.
 *
 * @see ItemStorageAggregatorComponent.InventoryComponent
 * @see ItemStorage
 * @see CharacterBank
 * @see CharacterDoll
 * @see CashComponent
 * @since 1.1.3
 */
public interface CharacterBelongings extends GameEntity {
    /**
     * get character's inventory bags.
     *
     * @return {@link ItemStorageAggregatorComponent.InventoryComponent} instance containing currently equipped bags.
     */
    @NotNull ItemStorageAggregatorComponent.InventoryComponent getInventory();

    /**
     * get character's bank storage.
     *
     * @return {@link ItemStorage} representing character's bank.
     */
    @NotNull CharacterBank getBank();

    /**
     * get character equipment.
     *
     * @return {@link CharacterDoll} instance containing items currently put on character.
     */
    @NotNull CharacterDoll getEquipment();

    /**
     * get current amount of cash owned by the character.
     *
     * @return {@link CashComponent} instance storing amount of cash available to the cahracter.
     */
    @NotNull CashComponent getCash();
}
