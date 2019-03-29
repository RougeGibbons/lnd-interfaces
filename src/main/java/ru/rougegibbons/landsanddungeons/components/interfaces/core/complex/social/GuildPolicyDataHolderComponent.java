package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social.Rank;

/**
 * {@link MapProviderComponent} interface extension providing
 * access to the guild policy's data, storing various {@link Rank}s' privileges.
 *
 * @see MapProviderComponent
 * @see Rank
 * @see PrivelegesHolderComponent
 * @since 1.1.3
 */
public interface GuildPolicyDataHolderComponent
        extends MapProviderComponent<Rank, PrivelegesHolderComponent> {
}
