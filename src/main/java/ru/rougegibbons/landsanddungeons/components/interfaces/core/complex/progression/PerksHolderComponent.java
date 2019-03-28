package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link MapProviderComponent} interface extension representing perk branch's perks storage.
 *
 * @see PropertyComponent
 * @see MapProviderComponent
 * @see GameEntityStorageComponent.PerkSlot
 * @since 1.1.3
 */
public interface PerksHolderComponent extends PropertyComponent,
        MapProviderComponent<Long, GameEntityStorageComponent.PerkSlot> {

}
