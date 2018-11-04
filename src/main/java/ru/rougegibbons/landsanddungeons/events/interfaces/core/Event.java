package ru.rougegibbons.landsanddungeons.events.interfaces.core;

import org.jetbrains.annotations.NotNull;

/**
 * core interface for ingame events.
 *
 * @since 1.0.2
 */
public interface Event {
    /**
     * get event id.
     *
     * @return event id.
     */
    @NotNull Long getId();
}
