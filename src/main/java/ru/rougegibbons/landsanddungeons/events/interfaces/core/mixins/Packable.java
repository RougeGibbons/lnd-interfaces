package ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.events.interfaces.models.EventModel;

/**
 * interface mixin for serializable {@link ru.rougegibbons.landsanddungeons.events.interfaces.core.Event}
 * implementations.
 *
 * @see ru.rougegibbons.landsanddungeons.events.interfaces.core.Event
 * @see EventModel
 * @since 1.0.2
 */
public interface Packable {
    /**
     * serializes {@link ru.rougegibbons.landsanddungeons.events.interfaces.core.Event} into some data model instance.
     *
     * @return serialized event data.
     */
    @NotNull EventModel pack();
}
