package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.requirements;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.ConditionalComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.UserCharacterContext;

/**
 * {@link ConditionalComponent} interface extension representing various requirements.
 *
 * @see PropertyComponent
 * @see ConditionalComponent
 * @see UserCharacterContext
 * @since 1.1.3
 */
public interface RequirementComponent extends PropertyComponent,
        ConditionalComponent<UserCharacterContext> {
}
