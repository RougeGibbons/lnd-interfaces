package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * interface mixin for various game entities that have name.
 *
 * @since 1.1.3
 */
public interface Named {
    /**
     * get entity's name.
     *
     * @return entity's name.
     */
    @NotNull String getName();
}
