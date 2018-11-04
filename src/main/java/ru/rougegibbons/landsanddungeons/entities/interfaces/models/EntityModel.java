package ru.rougegibbons.landsanddungeons.entities.interfaces.models;

import org.jetbrains.annotations.NotNull;

/**
 * interface for {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity}
 * implementations data models.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @since 1.0.2
 */
public interface EntityModel {
    /**
     * get entity instance id.
     *
     * @return instance id.
     */
    @NotNull Long getId();
}
