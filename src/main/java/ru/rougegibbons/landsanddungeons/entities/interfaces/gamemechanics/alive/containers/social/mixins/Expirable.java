package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * Interface mixin for objects with expiring validity.
 *
 * @since 1.1.3
 */
public interface Expirable {
    /**
     * check if the entity's timing is expired.
     *
     * @return true if entity's timing is expired, false otherwise.
     */
    @NotNull Boolean isExpired();
}
