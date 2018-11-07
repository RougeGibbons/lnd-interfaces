package ru.rougegibbons.landsanddungeons.events.interfaces.core;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.mixins.WithTarget;
import ru.rougegibbons.landsanddungeons.systems.interfaces.System;

/**
 * {@link Event} interface extension for events that also implement {@link WithTarget} interface.
 *
 * @param <T> - see {@link WithTarget} description.
 * @see Event
 * @see WithTarget
 * @see GameEntity
 * @see Component
 * @see System
 * @since 1.1.2
 */
public interface TargetEvent<T> extends Event, WithTarget<T> {
    /**
     * see {@link Event} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean hasTarget() {
        return true;
    }

    /**
     * {@link TargetEvent} interface extension for events with {@link Component} as target.
     *
     * @see Component
     * @since 1.1.2
     */
    interface ComponentTargetEvent extends TargetEvent<Component> {

    }

    /**
     * {@link TargetEvent} interface extension for events with {@link GameEntity} as target.
     *
     * @see GameEntity
     * @since 1.1.2
     */
    interface EntityTargetEvent extends TargetEvent<GameEntity> {

    }

    /**
     * {@link TargetEvent} extension for events with {@link System} implementation as target.
     *
     * @param <T> - see {@link WithTarget.SystemTarget} description.
     * @see System
     * @since 1.1.2
     */
    interface SystemTargetEvent<T extends System<?>> extends TargetEvent<T> {

    }
}
