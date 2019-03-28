package ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * interface mixin for the components that have their own descriptions.
 *
 * @since 1.1.3
 */
public interface WithDescription {
    /**
     * get component's description.
     *
     * @return component's description.
     */
    @NotNull String getDescription();
}
