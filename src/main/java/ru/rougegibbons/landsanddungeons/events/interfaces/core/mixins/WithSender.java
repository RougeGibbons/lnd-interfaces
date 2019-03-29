package ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.backends.interfaces.Backend;
import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.managers.interfaces.Manager;
import ru.rougegibbons.landsanddungeons.systems.interfaces.System;

/**
 * interface mixin for {@link ru.rougegibbons.landsanddungeons.events.interfaces.core.Event}
 * implementations that have sender.
 *
 * @param <T> - some class implementing proper sender interface (generally {@link GameEntity}, {@link Component} or {@link System}).
 * @see ru.rougegibbons.landsanddungeons.events.interfaces.core.Event
 * @see GameEntity
 * @see Component
 * @since 1.1.2
 */
public interface WithSender<T> {
    /**
     * get event sender.
     *
     * @return event sender as {@link T} or its extension implementation instance.
     */
    @NotNull T getSender();

    /**
     * {@link WithSender} interface extension for events where sender is some {@link Component} implementation instance.
     *
     * @see Component
     * @since 1.1.2
     */
    interface ComponentSender extends WithSender<Component> {

    }

    /**
     * {@link WithSender} interface extension for events where sender
     * is some {@link GameEntity} implementation instance.
     *
     * @see GameEntity
     * @since 1.1.2
     */
    interface EntitySender extends WithSender<GameEntity> {

    }

    /**
     * {@link WithSender} interface extension for events where sender is some {@link System} implementation instance.
     *
     * @param <T> - {@link System} interface implementation.
     * @see System
     * @since 1.1.2
     */
    interface SystemSender<T extends System<?>> extends WithSender<T> {

    }

    /**
     * {@link WithSender} interface extension for events where sender is some {@link Manager} implementation instance.
     *
     * @param <T> - {@link Manager} interface implementation.
     * @see Manager
     * @since 1.1.3
     */
    interface ManagerSender<T extends Manager<?>> extends WithSender<T> {

    }

    /**
     * {@link WithSender} interface extension for event where sender is some {@link Backend} implementation instance.
     *
     * @see Backend
     * @since 1.1.3
     */
    interface BackendSender extends WithSender<Backend> {

    }
}
