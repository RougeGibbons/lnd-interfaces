package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.matters;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeKind;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social.Rank;

/**
 * {@link GuildMatter} interface extension representing
 * changes in {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.GuildPolicy}.
 *
 * @see GuildMatter
 * @see PrivilegeLevel
 * @see PrivilegeKind
 * @see Rank
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.GuildPolicy
 * @since 1.1.3
 */
public interface ChangePolicyMatter extends GuildMatter {
    /**
     * get affected privilege kind.
     *
     * @return affected {@link PrivilegeKind}.
     */
    @NotNull PrivilegeKind getPrivilegeKind();

    /**
     * get suggested {@link PrivilegeLevel}.
     *
     * @return suggested {@link PrivilegeLevel}.
     */
    @NotNull PrivilegeLevel getSuggestedPrivilegeLevel();

    /**
     * get {@link Rank} affected by this policy change.
     *
     * @return affected {@link Rank}.
     */
    @NotNull Rank getAffectedRank();
}
