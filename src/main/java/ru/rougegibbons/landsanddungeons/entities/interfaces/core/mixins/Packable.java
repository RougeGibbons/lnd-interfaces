package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.models.EntityModel;

/**
 * interface mixin for serializable and deserializable
 * {@link ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity} implementations.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity
 * @see EntityModel
 * @since 1.0.2
 */
public interface Packable {
    /**
     * serializes entity into some data model instance.
     *
     * @return some {@link EntityModel} instance.
     */
    @NotNull EntityModel pack();
}
