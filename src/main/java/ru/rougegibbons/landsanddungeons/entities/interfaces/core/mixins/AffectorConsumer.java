package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.affectors.generic.AffectorComponent;

/**
 * interface mixin for {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity}
 * implementations which own affectable properties.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @see AffectorComponent
 * @see ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent
 * @see ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.UpdateablePropertyComponent
 * @since 1.1.2
 */
public interface AffectorConsumer {
    void attachAffector(@NotNull AffectorComponent affector);
}
