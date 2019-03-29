package ru.rougegibbons.landsanddungeons.events.interfaces.core.packable;

import ru.rougegibbons.landsanddungeons.events.interfaces.core.FullEvent;

/**
 * Packable version of {@link FullEvent} interface.
 *
 * @param <S> - sender object class.
 * @param <T> - target object class.
 * @see PackableEvent
 * @see FullEvent
 * @since 1.1.3
 */
public interface PackableFullEvent<S, T> extends PackableEvent, FullEvent<S, T> {
}
