package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * interface mixin for entities that represent
 * mortal objects (e.g. user characters, monsters, NPCs, etc.).
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @since 1.1.3
 */
public interface Alive extends AffectorConsumer {
    /**
     * checks if entity is dead.
     *
     * @return true if entity's current health is 0, false otherwise.
     */
    @NotNull Boolean isDead();

    /**
     * get entity's current health amount.
     *
     * @return entity's current health value.
     */
    @NotNull Integer getCurrentHealth();

    /**
     * get entity's maximal health.
     *
     * @return entity's maximal health.
     */
    @NotNull Integer getMaxHealth();

    /**
     * immediately kills entity, zeroing its current health.
     */
    void kill();
}
