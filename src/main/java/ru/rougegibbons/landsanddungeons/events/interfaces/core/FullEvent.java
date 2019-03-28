package ru.rougegibbons.landsanddungeons.events.interfaces.core;

import ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins.WithSender;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins.WithTarget;

/**
 * {@link Event} interface extension for events containing both sender and target.
 *
 * @param <S> - sender object class.
 * @param <T> - target object class
 * @see Event
 * @see WithSender
 * @see WithTarget
 * @since 1.1.3
 */
public interface FullEvent<S, T> extends Event,
        WithSender<S>, WithTarget<T> {
}
