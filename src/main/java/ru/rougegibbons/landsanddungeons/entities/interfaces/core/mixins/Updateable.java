package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

/**
 * interface mixin for updateable
 * {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity} implementations.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @since 1.0.2
 */
public interface Updateable {
    /**
     * updates game entity during game world simulation tick.
     */
    void update();
}
