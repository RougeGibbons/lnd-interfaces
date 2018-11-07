package ru.rougegibbons.landsanddungeons.entities.interfaces.core;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.Updateable;

/**
 * {@link GameEntity} interface extension implementing {@link Updateable} mixin.
 *
 * @see GameEntity
 * @see Updateable
 * @since 1.1.2
 */
public interface UpdateableEntity extends GameEntity, Updateable {
    /**
     * see {@link GameEntity} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean isUpdateable() {
        return true;
    }
}
