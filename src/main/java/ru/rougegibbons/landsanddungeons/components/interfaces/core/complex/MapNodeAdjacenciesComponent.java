package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex;

/**
 * {@link MapProviderComponent} interface extension for storing adjacent map nodes.
 *
 * @see MapProviderComponent
 * @see GameEntityStorageComponent.MapNodeSlot
 * @since 1.1.3
 */
public interface MapNodeAdjacenciesComponent extends
        MapProviderComponent<Integer, GameEntityStorageComponent.MapNodeSlot> {
}
