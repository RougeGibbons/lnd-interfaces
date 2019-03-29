package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.ConditionalComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.requirements.PerkRequirementComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.UserCharacterContext;

/**
 * {@link MapProviderComponent} and {@link ConditionalComponent} interfaces extension storing perk requirements.
 *
 * @see ConditionalComponent
 * @see MapProviderComponent
 * @see PropertyComponent
 * @see UserCharacterContext
 * @see PerkRequirementComponent
 * @since 1.1.3
 */
public interface PerkRequirementsHolderComponent extends ConditionalComponent<UserCharacterContext>,
        MapProviderComponent<Long, PerkRequirementComponent>, PropertyComponent {
}
