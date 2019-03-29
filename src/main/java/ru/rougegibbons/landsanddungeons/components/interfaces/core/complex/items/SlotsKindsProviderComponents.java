package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.items;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.SetProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.SingleNumberComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link SetProviderComponent} interface extension
 * representing sets of available item kinds for character class
 * or set of character slots given item can be equipped in.
 *
 * @see PropertyComponent
 * @see SetProviderComponent
 * @see SingleNumberComponent.SingleIntComponent
 * @since 1.1.3
 */
public interface SlotsKindsProviderComponents extends PropertyComponent,
        SetProviderComponent<SingleNumberComponent.SingleIntComponent> {
}
