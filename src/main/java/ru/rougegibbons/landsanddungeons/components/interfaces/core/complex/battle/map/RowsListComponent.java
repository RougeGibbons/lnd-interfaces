package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.map;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.ListProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link PropertyComponent} and {@link ListProviderComponent} interfaces extension
 * representing two-dimensional battle map nodes container (list of lists).
 *
 * @see PropertyComponent
 * @see ListProviderComponent
 * @see MapNodeRowComponent
 * @since 1.1.3
 */
public interface RowsListComponent extends PropertyComponent,
        ListProviderComponent<MapNodeRowComponent> {
}
