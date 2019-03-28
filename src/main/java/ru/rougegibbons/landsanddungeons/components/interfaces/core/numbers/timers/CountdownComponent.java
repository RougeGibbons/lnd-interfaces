package ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.timers;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.UpdateableComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.ModifiablePairNumberComponent;

/**
 * Interface for components representing
 * various countdown timers
 * (abilities cooldown, DoTs/HoTs/buffs/debuffs timers, etc.).
 *
 * @see UpdateableComponent
 * @see ModifiablePairNumberComponent.ModifiablePairIntComponent
 * @since 1.1.3
 */
public interface CountdownComponent extends UpdateableComponent,
        ModifiablePairNumberComponent.ModifiablePairIntComponent {
    /**
     * see {@link UpdateableComponent} description.
     */
    @Override
    default void update() {
        if (getFirstValue() > 0) {
            decreaseFirstValue(1);
        }
    }

    /**
     * checks if countdown is ended already.
     *
     * @return true if first value has reached zero, false otherwise.
     */
    default @NotNull Boolean isElapsed() {
        return getFirstValue() == 0;
    }
}
