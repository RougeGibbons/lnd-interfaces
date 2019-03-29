package ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.backends.interfaces.Backend;
import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.managers.interfaces.Manager;
import ru.rougegibbons.landsanddungeons.systems.interfaces.System;

/**
 * interface mixin for the {@link ru.rougegibbons.landsanddungeons.events.interfaces.core.Event}
 * implementations that have target.
 *
 * @param <T> - some class implementing proper sender interface (generally {@link GameEntity}, {@link Component} or {@link System}).
 * @see ru.rougegibbons.landsanddungeons.events.interfaces.core.Event
 * @see GameEntity
 * @see Component
 * @since 1.1.2
 */
public interface WithTarget<T> {
    /**
     * get event target.
     *
     * @return event target.
     */
    @NotNull T getTarget();

    /**
     * {@link WithTarget} interface extension for events where target is a {@link Component} interface implementation.
     *
     * @see Component
     * @since 1.1.2
     */
    interface ComponentTarget extends WithTarget<Component> {

    }

    /**
     * {@link WithTarget} interface extension for events where target is a {@link GameEntity} interface implementation.
     *
     * @see GameEntity
     * @since 1.1.2
     */
    interface EntityTarget extends WithTarget<GameEntity> {

    }

    /**
     * {@link WithTarget} interface extension for events where target is a {@link System} interface implementation.
     *
     * @param <T> - {@link System} interface implementation.
     * @see System
     * @since 1.1.2
     */
    interface SystemTarget<T extends System<?>> extends WithTarget<T> {

    }

    /**
     * {@link WithTarget} interface extension for events where target is a {@link Manager} interface implementation.
     *
     * @param <T> - {@link Manager} interface implementation.
     * @see Manager
     * @since 1.1.3
     */
    interface ManagerTarget<T extends Manager<?>> extends WithTarget<T> {

    }

    /**
     * {@link WithTarget} interface extension for events where target is a {@link Backend} interface implementation.
     *
     * @see Backend
     * @since 1.1.3
     */
    interface BackendTarget extends WithTarget<Backend> {

    }
}
