package ru.rougegibbons.landsanddungeons.entities.interfaces.core;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.Packable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.PropertyOwner;

/**
 * parent interface for all ingame entities.
 *
 * @see Packable
 * @see PropertyOwner
 * @since 1.0.2
 */
public interface GameEntity extends PropertyOwner, Packable {
    /**
     * get entity id.
     *
     * @return entity id.
     */
    @NotNull Long getId();

    /**
     * checks if entity has update() method.
     *
     * @return true if entity has update() method, false otherwise.
     */
    default @NotNull Boolean isUpdateable() {
        return false;
    }

    /**
     * checks if entity has property components.
     *
     * @return true if entity has at least one property component, false otherwise.
     */
    default @NotNull Boolean ownsAffectors() {
        return false;
    }
}
