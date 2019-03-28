package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.timers.CountdownComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;

/**
 * mixin representing objects that have built-in {@link CountdownComponent} timer.
 *
 * @see CountdownComponent
 * @see Expirable
 * @since 1.1.3
 */
public interface Timed extends UpdateableEntity, Expirable {
    /**
     * get timer belonging to that entity.
     *
     * @return {@link CountdownComponent} representing entity's timer.
     */
    @NotNull CountdownComponent getTimer();
}
