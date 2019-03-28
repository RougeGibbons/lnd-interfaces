package ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.collections;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.number.mutable.EntityStatPropertyComponent;

/**
 * interface for components representing alive entities / items stat lists.
 *
 * @see MapProviderComponent
 * @see EntityStatPropertyComponent
 * @see Integer
 * @since 1.1.3
 */
public interface StatListPropertyComponent extends MapProviderComponent<Integer, EntityStatPropertyComponent> {
}
