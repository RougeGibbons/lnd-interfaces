package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.map;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.ListProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link ListProviderComponent} interface extension
 * representing map nodes ordering in route-like tilesets.
 *
 * @see PropertyComponent
 * @see PairNumberComponent.PairIntComponent
 * @see ListProviderComponent
 * @since 1.1.3
 */
public interface RouteOrderingComponent extends PropertyComponent,
        ListProviderComponent<PairNumberComponent.PairIntComponent> {

}
