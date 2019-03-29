package ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.number.mutable;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.Named;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.WithDescription;

/**
 * interface for the properties representing entity stats (strength, desxterity, stamina, etc.).
 *
 * @see MutableSingleNumberPropertyComponent
 * @see Named
 * @see WithDescription
 * @since 1.1.3
 */
public interface EntityStatPropertyComponent extends MutableSingleNumberPropertyComponent, Named, WithDescription {
    /**
     * gets stat value without applied affectors (see {@link MutableSingleNumberPropertyComponent} description).
     *
     * @return stat value without affections.
     */
    @NotNull Integer getRawValue();

    /**
     * gets total affection applied to the component.
     *
     * @return total affection value.
     */
    @NotNull Integer getTotalBonus();
}
