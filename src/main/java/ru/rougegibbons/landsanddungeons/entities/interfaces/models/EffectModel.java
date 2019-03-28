package ru.rougegibbons.landsanddungeons.entities.interfaces.models;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;

/**
 * {@link EntityModel} interface extension representing in-game effects' model.
 *
 * @see EntityModel
 * @see MapProviderComponent.GameEntityAffectorsContainer
 * @since 1.1.3
 */
public interface EffectModel extends EntityModel {
    /**
     * get effect's name numerical id.
     *
     * @return effect's name id.
     */
    @NotNull Long getNameId();

    /**
     * get effect's description numerical id.
     *
     * @return effect's description id.
     */
    @NotNull Long getDescriptionId();

    /**
     * get effect's duration in turns.
     *
     * @return effect's duration.
     */
    @NotNull Integer getDuration();

    /**
     * get effect's affectors.
     *
     * @return effect's affectors as {@link MapProviderComponent.GameEntityAffectorsContainer} implementation instance.
     */
    @NotNull MapProviderComponent.GameEntityAffectorsContainer getAffectors();
}
