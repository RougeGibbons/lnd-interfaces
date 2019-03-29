package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges;

/**
 * enumeration describing privelege's permission level
 * (shall it copy guild rank's permission, is prohibited,
 * is allowed to raise a poll for permission,
 * is allowed to request guil leader's permission directly,
 * is allowed to act without anyone's permission).
 *
 * @see PrivilegeKind
 * @since 1.1.3
 */
public enum PrivilegeLevel {
    PL_AS_RANK,
    PL_PROHIBITED,
    PL_WITH_POLL,
    PL_WITH_GL_PERMISSION,
    PL_FREE
}
