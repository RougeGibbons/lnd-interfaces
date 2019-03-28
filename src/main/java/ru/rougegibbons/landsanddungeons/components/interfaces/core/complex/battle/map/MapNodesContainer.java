package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.map;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link MapProviderComponent} interface extension representing map nodes tileset contents.
 * Contents stored as {@link java.util.Map} {@link PairNumberComponent.PairIntComponent}
 * (map node's coordinates) to {@link GameEntityStorageComponent.MapNodeSlot}.
 *
 * @see PropertyComponent
 * @see MapProviderComponent
 * @see GameEntityStorageComponent.MapNodeSlot
 * @see PairNumberComponent.PairIntComponent
 * @since 1.1.3
 */
public interface MapNodesContainer extends PropertyComponent,
        MapProviderComponent<PairNumberComponent.PairIntComponent,
                GameEntityStorageComponent.MapNodeSlot> {

}
