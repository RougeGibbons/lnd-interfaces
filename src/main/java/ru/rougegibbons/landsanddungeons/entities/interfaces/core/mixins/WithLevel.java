package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * interface mixin for such entities that have a level.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @since 1.1.3
 */
public interface WithLevel {
    /**
     * get entity level.
     *
     * @return entity level.
     */
    @NotNull Integer getLevel();
}
