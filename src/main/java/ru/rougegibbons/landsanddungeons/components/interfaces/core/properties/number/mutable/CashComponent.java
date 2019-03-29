package ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.number.mutable;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.ModifiableSingleNumberComponent;

/**
 * {@link ModifiableSingleNumberComponent.ModifiableSingleIntComponent} interface extension
 * for storing one's cash data.
 *
 * @see ModifiableSingleNumberComponent.ModifiableSingleIntComponent
 * @since 1.1.3
 */
public interface CashComponent extends ModifiableSingleNumberComponent.ModifiableSingleIntComponent {
    /**
     * check if one can afford to spend given amount of cash.
     *
     * @param amount - amount of cash to check.
     * @return true if current amount of cash is not less than given amount, false otherwise.
     */
    default @NotNull Boolean canAfford(@NotNull Integer amount) {
        return getValue() >= amount;
    }
}
