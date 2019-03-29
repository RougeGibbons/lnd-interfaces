package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.flyweights;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.string.TextPropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeKind;

/**
 * {@link MapProviderComponent} interface extension
 * for storing {@link PrivilegeKind} objects' text namings.
 *
 * @see MapProviderComponent
 * @see PrivilegeKind
 * @see TextPropertyComponent
 * @since 1.1.3
 */
public interface GuildPrivilegesNamingsComponent
        extends MapProviderComponent<PrivilegeKind, TextPropertyComponent> {
}
