package ru.rougegibbons.landsanddungeons.systems.interfaces;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.Event;

/**
 * interface for various game mechanics systems,
 * responsible for handling components, entities events
 * and doing some other jobs like working with resources, authentication, etc.
 *
 * @param <T> - class for system to be responsible for.
 * @see GameEntity
 * @see Component
 * @since 1.1.2
 */
public interface System<T> {
    /**
     * performs system tick.
     */
    void update();

    /**
     * attaches new element to the system observables pool.
     *
     * @param element - element to attach.
     */
    void attachElement(@NotNull T element);

    /**
     * detaches element from the system observables pool by its ID.
     *
     * @param elementId - ID of the element to detach.
     */
    void detachElement(@NotNull Long elementId);

    /**
     * detaches given element from system's observables pool.
     *
     * @param element - element to detach from the system.
     */
    void detachElement(@NotNull T element);

    /**
     * receives given event and pushes it into processing queue.
     *
     * @param event - event to enqueue.
     */
    void receiveEvent(@NotNull Event event);

    /**
     * {@link System} interface extension for systems working with {@link Component} interface extensions.
     *
     * @param <C> - some {@link Component} interface extension.
     * @see System
     * @see Component
     * @since 1.1.3
     */
    interface ComponentSystem<C extends Component> extends System<C> {

    }

    /**
     * {@link System} interface extension for systems working with {@link GameEntity} interface extensions.
     *
     * @param <E> - some {@link GameEntity} interface extension.
     * @see System
     * @see GameEntity
     * @since 1.1.3
     */
    interface GameEntitySystem<E extends GameEntity> extends System<E> {

    }
}
