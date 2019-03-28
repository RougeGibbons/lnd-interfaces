package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.GuildPolicyDataHolderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.PrivelegesHolderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeKind;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social.Rank;

/**
 * {@link GameEntity} extension for storing
 * and controlling guild {@link Rank}s' privileges.
 *
 * @see GameEntity
 * @see GuildPolicyDataHolderComponent
 * @see PrivelegesHolderComponent
 * @see Rank
 * @since 1.1.3
 */
public interface GuildPolicy extends GameEntity {
    /**
     * get guild's id this policy belongs to.
     *
     * @return guild id.
     */
    @NotNull Long getGuildId();

    /**
     * get currently active guild policies for all ranks.
     *
     * @return {@link GuildPolicyDataHolderComponent} representing active guild policies.
     */
    @NotNull GuildPolicyDataHolderComponent getRankPolicies();

    /**
     * get currently active guild policies for given {@link Rank}.
     *
     * @param rank - {@link Rank} to get guild policies for.
     * @return currently active guild policies for given {@link Rank} as {@link PrivelegesHolderComponent}.
     */
    default @Nullable PrivelegesHolderComponent getRankPolicy(@NotNull Rank rank) {
        return getRankPolicies().getOrDefault(rank, null);
    }

    /**
     * change given privilege for given {@link Rank}, setting it to given level.
     *
     * @param rank      - {@link Rank} to change given privilege for.
     * @param privilege - privilege to change for given {@link Rank}.
     * @param newLevel  - new {@link PrivilegeLevel} to set the given privilege at.
     */
    default void changeRankPolicy(@NotNull Rank rank,
                                  @NotNull PrivilegeKind privilege,
                                  @NotNull PrivilegeLevel newLevel) {
        final PrivelegesHolderComponent rankPolicy = getRankPolicy(rank);
        if (rankPolicy != null) {
            rankPolicy.replace(privilege, newLevel);
        }
    }
}
