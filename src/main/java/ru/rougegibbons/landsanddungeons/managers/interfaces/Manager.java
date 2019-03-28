package ru.rougegibbons.landsanddungeons.managers.interfaces;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.managers.interfaces.models.ObjectModel;

/**
 * interface for classes controlling various entities and components lifecycle.
 * Implements Object Pool pattern.
 *
 * @param <T> - class this manager kind takes care of.
 * @since 1.1.3
 */
public interface Manager<T> {
    /**
     * get element by id if it's present in the manager's pool.
     *
     * @param id - requested element id.
     * @return requested element if it's present in the manager's pool, null otherwise.
     */
    @Nullable T getElement(@NotNull Long id);

    /**
     * instantiates new element by given element data model.
     *
     * @param model - data model to instantiate object from.
     * @return instantiated element if given data model is supported and not corrupted, null otherwise.
     */
    @Nullable T createElement(@NotNull ObjectModel model);


    /**
     * registers given element in the manager if it's not registered already.
     *
     * @param element - element to register.
     */
    void registerElement(@NotNull T element);

    /**
     * purges element from the manager's pool. Element is taken by given id.
     *
     * @param id - id of the element to destroy.
     */
    void destroyElement(@NotNull Long id);

    /**
     * purges given element from the manager's pool.
     *
     * @param element - element to destroy.
     */
    void destroyElement(@NotNull T element);

    /**
     * performs a manager tick.
     */
    void update();

    /**
     * {@link Manager} interface extension for managers working with {@link GameEntity} extensions.
     *
     * @param <E> - some {@link GameEntity} interface extension.
     * @see Manager
     * @see GameEntity
     * @since 1.1.3
     */
    interface GameEntityManager<E extends GameEntity> extends Manager<E> {

    }

    /**
     * {@link Manager} interface extension for managers working with {@link Component} extensions.
     *
     * @param <C> - some {@link Component} interface extension.
     * @see Manager
     * @see Component
     * @since 1.1.3
     */
    interface ComponentManager<C extends Component> extends Manager<C> {

    }
}
