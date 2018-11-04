package ru.rougegibbons.landsanddungeons.entities.interfaces.core;

import org.jetbrains.annotations.NotNull;

/**
 * parent interface for all ingame entities.
 *
 * @since 1.0.2
 */
public interface GameEntity {
    /**
     * get entity id.
     *
     * @return entity id.
     */
    @NotNull Long getId();

    /**
     * checks if entity has update() method.
     *
     * @return true if entity has update() method, false otherwise.
     */
    default @NotNull Boolean isUpdateable() {
        return false;
    }

    /**
     * checks if entity is (de)serializable.
     *
     * @return true if entity has pack() method, false otherwise.
     */
    default @NotNull Boolean isPackable() {
        return false;
    }

    /**
     * checks if entity has property components.
     *
     * @return true if entity has at least one property component, false otherwise.
     */
    default @NotNull Boolean ownsProperties() {
        return false;
    }

    /**
     * checks if entity has property components.
     *
     * @return true if entity has at least one property component, false otherwise.
     */
    default @NotNull Boolean ownsAffectors() {
        return false;
    }
}
