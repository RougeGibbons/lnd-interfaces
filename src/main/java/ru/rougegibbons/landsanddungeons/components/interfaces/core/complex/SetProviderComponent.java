package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex;

import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.SingleNumberComponent;

import java.util.Set;

/**
 * interface for components containing other components
 * and representing them as a {@link Set}.
 *
 * @param <T> - any implementation of {@link Component} interface and its extensions.
 * @see Component
 * @see PackableComponent
 * @see Set
 * @since 0.4.6
 */
public interface SetProviderComponent<T extends Component>
        extends PackableComponent, Set<T> {
    /**
     * {@link SetProviderComponent} interface extensions for storing sets of other entities' IDs.
     *
     * @see SetProviderComponent
     * @since 1.1.3
     */
    interface IdSetComponent extends SetProviderComponent<SingleNumberComponent.SingleLongComponent> {

    }
}
