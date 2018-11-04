package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;

/**
 * generified interface for components that may store some ingame entities,
 * e.g. backpack/bank slots, spellbook, talent trees, etc.
 *
 * @param <T> - any class implementing  {@link GameEntity} interface or its extensions.
 * @see GameEntity
 * @since 1.0.2
 */
public interface GameEntityStorageComponent<T extends GameEntity> extends PackableComponent {
    /**
     * get stored entity.
     *
     * @return stored entity or null if component is empty.
     */
    @Nullable T getStored();

    /**
     * checks if component stores some entity or not?
     *
     * @return true if stored value is null, false otherwise.
     */
    @NotNull Boolean isEmpty();
}
