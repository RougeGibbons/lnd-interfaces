package ru.rougegibbons.landsanddungeons.events.interfaces.core.packable;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.Event;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins.Packable;

/**
 * {@link Event} interface extension for serializable events.
 *
 * @see Event
 * @see Packable
 * @since 1.1.2
 */
public interface PackableEvent extends Event, Packable {
    /**
     * see {@link Event} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean isPackable() {
        return true;
    }
}
