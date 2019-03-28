package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link MapProviderComponent} interface extension for storing active guild matters.
 *
 * @see MapProviderComponent
 * @see GameEntityStorageComponent.GuildMatterSlot
 * @since 1.1.3
 */
public interface GuildMattersHolderComponent extends PropertyComponent,
        MapProviderComponent<Long, GameEntityStorageComponent.GuildMatterSlot> {
}
