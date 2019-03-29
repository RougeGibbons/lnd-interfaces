package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity} interface mixin
 * for entities that have text descriptions.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @since 1.1.3
 */
public interface WithDescription {
    /**
     * get entity's description.
     *
     * @return entity's description.
     */
    @NotNull String getDescription();
}
