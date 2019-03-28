package ru.rougegibbons.landsanddungeons.backends.interfaces;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.backends.interfaces.messages.Message;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.Event;

/**
 * main interface for backends representing various
 * game services (authentication, resources handling,
 * battle, matchmaking, etc.).
 *
 * @see Message
 * @see Event
 * @since 1.1.3
 */
public interface Backend {
    /**
     * performs backend update tick.
     */
    void update();

    /**
     * checks if backend is available.
     *
     * @return true if backend is available and ready, false otherwise.
     */
    @NotNull Boolean isAvailable();

    /**
     * checks backend's inbox pool and picks top {@link Message} from it.
     *
     * @return top {@link Message} from inbox queue or null if inbox queue is empty.
     */
    @Nullable Message recvFrom();

    /**
     * takes given {@link Message} and puts it into backend's outbox pool.
     *
     * @param message - {@link Message} to send.
     */
    void sendTo(@NotNull Message message);

    /**
     * takes given {@link Event}, converts it into corresponding {@link Message} and puts it into backend's outbox pool.
     *
     * @param event - {@link Event} to send.
     */
    void sendTo(@NotNull Event event);

    /**
     * checks if there's any data in backend's outbox pool.
     *
     * @return true if backend's outbox pool is not empty, false otherwise.
     */
    @NotNull Boolean hasData();
}
