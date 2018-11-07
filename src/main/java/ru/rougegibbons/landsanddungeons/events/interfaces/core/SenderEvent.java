package ru.rougegibbons.landsanddungeons.events.interfaces.core;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins.WithSender;
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
     */
    interface EntitySenderEvent extends SenderEvent<GameEntity> {

    }

    /**
     * {@link SenderEvent} extension for events with {@link Component} implementation as sender.
     */
    interface ComponentSenderEvent extends SenderEvent<Component> {

    }

    /**
     * {@link SenderEvent} extension for events with {@link System} implementation as sender.
     *
     * @param <T> - see {@link WithSender.SystemSender} description.
     */
    interface SystemSenderEvent<T extends System<?>> extends SenderEvent<T> {

    }
}
