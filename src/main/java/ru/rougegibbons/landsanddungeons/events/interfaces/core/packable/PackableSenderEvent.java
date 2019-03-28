package ru.rougegibbons.landsanddungeons.events.interfaces.core.packable;

import ru.rougegibbons.landsanddungeons.events.interfaces.core.SenderEvent;

/**
 * Packable version of {@link SenderEvent}.
 *
 * @param <T> - sender object class.
 * @see SenderEvent
 * @see PackableEvent
 * @since 1.1.3
 */
public interface PackableSenderEvent<T> extends PackableEvent, SenderEvent<T> {
}
