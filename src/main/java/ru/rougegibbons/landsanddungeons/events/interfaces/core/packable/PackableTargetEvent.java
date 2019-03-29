package ru.rougegibbons.landsanddungeons.events.interfaces.core.packable;

import ru.rougegibbons.landsanddungeons.events.interfaces.core.TargetEvent;

/**
 * Packable version of {@link TargetEvent}.
 *
 * @param <T> - target object class.
 * @see PackableEvent
 * @see TargetEvent
 * @since 1.1.3
 */
public interface PackableTargetEvent<T> extends PackableEvent, TargetEvent<T> {
}
