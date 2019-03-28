package ru.rougegibbons.landsanddungeons.events.interfaces.core;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.backends.interfaces.Backend;
import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins.WithSender;
import ru.rougegibbons.landsanddungeons.managers.interfaces.Manager;
import ru.rougegibbons.landsanddungeons.systems.interfaces.System;

/**
 * {@link Event} interface extension implementing {@link WithSender} interface.
 *
 * @param <T> - see {@link WithSender} description.
 * @see Event
 * @see WithSender
 * @see GameEntity
 * @see Component
 * @see System
 * @see Manager
 * @see Backend
 * @since 1.1.2
 */
public interface SenderEvent<T> extends Event, WithSender<T> {
    /**
     * see {@link Event} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean hasSender() {
        return true;
    }

    /**
     * {@link SenderEvent} extension for events with {@link GameEntity} implementation as sender.
     *
     * @see GameEntity
     * @since 1.1.2
     */
    interface EntitySenderEvent extends SenderEvent<GameEntity> {

    }

    /**
     * {@link SenderEvent} extension for events with {@link Component} implementation as sender.
     *
     * @see Component
     * @since 1.1.2
     */
    interface ComponentSenderEvent extends SenderEvent<Component> {

    }

    /**
     * {@link SenderEvent} extension for events with {@link System} implementation as sender.
     *
     * @param <T> - see {@link WithSender.SystemSender} description.
     * @see System
     * @since 1.1.2
     */
    interface SystemSenderEvent<T extends System<?>> extends SenderEvent<T> {

    }

    /**
     * {@link SenderEvent} extension for events with {@link Manager} implementation as sender.
     *
     * @param <T> - see {@link WithSender.ManagerSender} description.
     * @see Manager
     * @since 1.1.3
     */
    interface ManagerSenderEvent<T extends Manager<?>> extends SenderEvent<T> {

    }

    /**
     * {@link SenderEvent} extension for events with {@link Backend} implementation as sender.
     *
     * @see Backend
     * @since 1.1.3
     */
    interface BackendSenderEvent extends SenderEvent<Backend> {

    }
}
