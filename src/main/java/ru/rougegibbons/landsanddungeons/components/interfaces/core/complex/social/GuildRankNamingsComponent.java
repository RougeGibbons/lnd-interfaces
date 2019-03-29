package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.string.TextPropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.Guild;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social.Rank;

/**
 * {@link MapProviderComponent} interface extension to store user-defined names
 * for {@link Rank}s.
 *
 * @see MapProviderComponent
 * @see Rank
 * @see Guild
 * @since 1.1.3
 */
public interface GuildRankNamingsComponent extends
        MapProviderComponent<Rank, TextPropertyComponent> {

}
