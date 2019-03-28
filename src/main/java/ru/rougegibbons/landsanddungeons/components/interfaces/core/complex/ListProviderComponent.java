package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex;

import ru.rougegibbons.landsanddungeons.components.interfaces.Component;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.affectors.generic.AffectorComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.SingleNumberComponent;

import java.util.List;

/**
 * interface for components containing other components
 * and representing them as a {@link List}.
 *
 * @param <T> - any implementation of {@link Component} interface and its extensions.
 * @see Component
 * @see PackableComponent
 * @see List
 * @since 0.4.6
 */
public interface ListProviderComponent<T extends Component> extends
        PackableComponent, List<T> {
    /**
     * {@link ListProviderComponent} interface extension for storing {@link AffectorComponent}.
     *
     * @see ListProviderComponent
     * @see AffectorComponent
     * @since 1.1.3
     */
    interface AffectorsList extends ListProviderComponent<AffectorComponent> {

    }

    /**
     * {@link ListProviderComponent} interface extension for storing listed entities' IDs.
     *
     * @see ListProviderComponent
     * @since 1.1.3
     */
    interface IdsListComponent extends ListProviderComponent<SingleNumberComponent.SingleLongComponent> {

    }
}
