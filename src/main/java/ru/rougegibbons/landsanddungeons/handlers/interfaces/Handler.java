package ru.rougegibbons.landsanddungeons.handlers.interfaces;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.backends.interfaces.messages.Message;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.Event;

/**
 * interface for storing other classes (like events and messages) processing mechanisms.
 *
 * @since 1.1.3
 */
public interface Handler<T> {
    /**
     * handles given processable object.
     *
     * @param toHandle - object to handle.
     */
    void handle(@NotNull T toHandle);

    /**
     * {@link Handler} interface extension narrowing
     * the handleables scope to only {@link Event} interface implementations.
     *
     * @param <E> - class implementing {@link Event} interface or its extensions.
     * @since 1.1.3
     */
    interface EventHandler<E extends Event> extends Handler<E> {

    }

    /**
     * {@link Handler} interface extension narrowing
     * the handleables scope to only {@link Message} interface implementations.
     *
     * @param <M> - class implementing {@link Message} interface or its extensions.
     * @since 1.1.3
     */
    interface MessageHandler<M extends Message> extends Handler<M> {

    }
}
