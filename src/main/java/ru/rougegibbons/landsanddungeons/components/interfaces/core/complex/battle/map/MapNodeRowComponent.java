package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.map;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.ListProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link PropertyComponent} and {@link ListProviderComponent} interfaces extension
 * representing row of battle map nodes.
 *
 * @see PropertyComponent
 * @see ListProviderComponent
 * @see GameEntityStorageComponent.MapNodeSlot
 * @since 1.1.3
 */
public interface MapNodeRowComponent extends PropertyComponent,
        ListProviderComponent<GameEntityStorageComponent.MapNodeSlot> {
}
