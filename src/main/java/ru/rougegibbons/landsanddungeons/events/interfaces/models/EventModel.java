package ru.rougegibbons.landsanddungeons.events.interfaces.models;

import org.jetbrains.annotations.NotNull;

/**
 * data model interface for {@link ru.rougegibbons.landsanddungeons.events.interfaces.core.Event}
 * implementations serialization and deserialization.
 *
 * @see ru.rougegibbons.landsanddungeons.events.interfaces.core.Event
 * @since 1.0.2
 */
public interface EventModel {
    /**
     * get instance id.
     *
     * @return instance id.
     */
    @NotNull Long getId();
}
