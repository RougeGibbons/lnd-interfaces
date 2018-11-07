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

    /**
     * get event code describing what kind of event this instance is.
     *
     * @return instance's event code.
     */
    @NotNull Integer getEventCode();

    /**
     * check if event instance is serializable.
     *
     * @return true if instance's class has pack() method, false otherwise.
     */
    default @NotNull Boolean isPackable() {
        return false;
    }

    /**
     * checks if event instance has data about event sender.
     *
     * @return true if instance's class has getSender() method, false otherwise.
     */
    default @NotNull Boolean hasSender() {
        return false;
    }

    /**
     * checks if event instance has data about event target.
     *
     * @return true if instance's class has getTarget() method, false otherwise.
     */
    default @NotNull Boolean hasTarget() {
        return false;
    }
}
