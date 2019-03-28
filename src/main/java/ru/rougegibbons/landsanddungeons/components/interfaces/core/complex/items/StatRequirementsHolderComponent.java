package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.items;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.ConditionalComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.requirements.StatRequirementComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.UserCharacterContext;

/**
 * {@link ConditionalComponent} and {@link MapProviderComponent} interfaces extension
 * representing item's requirements to possible wearer's stats.
 *
 * @see ConditionalComponent
 * @see UserCharacterContext
 * @see PropertyComponent
 * @see MapProviderComponent
 * @see StatRequirementComponent
 * @since 1.1.3
 */
public interface StatRequirementsHolderComponent extends ConditionalComponent<UserCharacterContext>,
        PropertyComponent, MapProviderComponent<Long, StatRequirementComponent> {

}
