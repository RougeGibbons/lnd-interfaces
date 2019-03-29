package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link MapProviderComponent} interface extension
 * for storing {@link CharacterClassProgressionComponent} with taken character classes
 * and character's progression in them.
 *
 * @see MapProviderComponent
 * @see PropertyComponent
 * @see CharacterClassProgressionComponent
 * @since 1.1.3
 */
public interface CharacterClassesHolderComponent extends
        MapProviderComponent<Long, CharacterClassProgressionComponent>, PropertyComponent {
}
