package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeKind;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeLevel;

import java.util.Map;

/**
 * {@link PackableComponent} interface extension
 * for storing guild member's or guild policy's priveleges mapping.
 *
 * @see Map
 * @see PackableComponent
 * @see PrivilegeKind
 * @see PrivilegeLevel
 * @since 1.1.3
 */
public interface PrivelegesHolderComponent extends PackableComponent,
        Map<PrivilegeKind, PrivilegeLevel> {

}
