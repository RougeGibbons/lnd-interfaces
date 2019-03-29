package ru.rougegibbons.landsanddungeons.handlers.interfaces.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.backends.interfaces.messages.Message;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.Event;
import ru.rougegibbons.landsanddungeons.handlers.interfaces.Handler;

/**
 * interface mixin for classes responsible for various commands (like messages and events) processing.
 *
 * @see Handler
 * @since 1.1.3
 */
public interface HandlerProvider {
    /**
     * registers new {@link Handler} for a given class instance.
     *
     * @param handleableClass - class of objects to be handled by the new handler registered.
     * @param handler         - {@link Handler} instance to be used for given handleable class.
     * @param <T>             - class of the objects to be handled by the newly registerd handler.
     */
    <T> void registerHandler(@NotNull Class<T> handleableClass, @NotNull Handler<T> handler);

    /**
     * {@link HandlerProvider} interface extension working
     * only with classes implementing {@link Event} interface or its extensions.
     *
     * @see Event
     * @since 1.1.3
     */
    interface EventHandlerProvider extends HandlerProvider {
        @NotNull Event handle(@NotNull Event event);
    }

    /**
     * {@link HandlerProvider} interface extension working
     * only with classes implementing {@link Message} interface or its extensions.
     *
     * @see Message
     * @since 1.1.3
     */
    interface MessageHandlerProvider extends HandlerProvider {
        @NotNull Message handle(@NotNull Message message);
    }

    /**
     * an interface for the classes that have to process both events and messages.
     *
     * @see Event
     * @see Message
     * @since 1.1.3
     */
    interface MixedHandlerProvider extends EventHandlerProvider, MessageHandlerProvider {

    }
}
