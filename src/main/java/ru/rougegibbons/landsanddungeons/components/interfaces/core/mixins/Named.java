package ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * interface mixin for components that have its own name.
 *
 * @since 1.1.3
 */
public interface Named {
    /**
     * get component name.
     *
     * @return component's name.
     */
    @NotNull String getName();
}
