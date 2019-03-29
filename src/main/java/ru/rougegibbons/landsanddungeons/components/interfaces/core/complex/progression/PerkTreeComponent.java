package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link MapProviderComponent} interface extension representing character class' perk tree.
 *
 * @see PropertyComponent
 * @see MapProviderComponent
 * @see GameEntityStorageComponent.PerkBranchSlot
 * @since 1.1.3
 */
public interface PerkTreeComponent extends PropertyComponent,
        MapProviderComponent<Long, GameEntityStorageComponent.PerkBranchSlot> {
}
