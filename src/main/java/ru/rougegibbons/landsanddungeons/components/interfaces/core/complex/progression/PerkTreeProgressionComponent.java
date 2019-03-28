package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link MapProviderComponent} interface extension representing
 * character's progress in given class' perk branches.
 *
 * @see MapProviderComponent
 * @see PerkBranchProgressionComponent
 * @see PropertyComponent
 * @since 1.1.3
 */
public interface PerkTreeProgressionComponent
        extends MapProviderComponent<Long, PerkBranchProgressionComponent>, PropertyComponent {
}
