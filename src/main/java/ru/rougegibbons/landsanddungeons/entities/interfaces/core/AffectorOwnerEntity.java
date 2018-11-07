package ru.rougegibbons.landsanddungeons.entities.interfaces.core;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.AffectorOwner;

/**
 * {@link GameEntity} interface extensions for entities that have their own affectors.
 *
 * @see GameEntity
 * @see AffectorOwner
 * @see ru.rougegibbons.landsanddungeons.components.interfaces.core.affectors.generic.AffectorComponent
 * @since 1.1.2
 */
public interface AffectorOwnerEntity extends GameEntity, AffectorOwner {
    /**
     * see {@link GameEntity} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean ownsAffectors() {
        return true;
    }
}
