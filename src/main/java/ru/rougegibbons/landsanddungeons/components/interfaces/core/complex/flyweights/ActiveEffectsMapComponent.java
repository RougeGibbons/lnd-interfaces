package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.flyweights;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;

/**
 * {@link MapProviderComponent} interface extension representing active effects placed on entity.
 *
 * @see MapProviderComponent
 * @see EffectSlot
 * @since 1.1.3
 */
public interface ActiveEffectsMapComponent extends
        MapProviderComponent<Long, EffectSlot> {
}
