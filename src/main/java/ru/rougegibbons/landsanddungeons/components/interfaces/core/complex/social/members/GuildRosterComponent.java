package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.members;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social.Rank;

/**
 * {@link MapProviderComponent} interface extension for storing guild rosters.
 *
 * @see MapProviderComponent
 * @see Rank
 * @see GuildMembersDataComponent
 * @since 1.1.3
 */
public interface GuildRosterComponent extends
        MapProviderComponent<Rank, GuildMembersDataComponent> {
    /**
     * get guild member's rank by id.
     *
     * @param memberId - id of the guild member to get rank of.
     * @return guild member's {@link Rank} if such id is among this guild's members, GR_NONE otherwise.
     */
    default @NotNull Rank getRank(@NotNull Long memberId) {
        for (Rank rank : keySet()) {
            if (get(rank).containsKey(memberId)) {
                return rank;
            }
        }

        return Rank.GR_NONE;
    }

    /**
     * transfer member from one rank to another.
     *
     * @param memberId - id of the guild member to transfer.
     * @param newRank  - rank to transfer the guild member to.
     */
    default void transferMember(@NotNull Long memberId,
                                @NotNull Rank newRank) {
        final Rank oldRank = getRank(memberId);
        if ((oldRank != Rank.GR_NONE) && (newRank != Rank.GR_NONE)) {
            if (containsKey(newRank) && !isRankFilled(newRank)) {
                get(newRank).put(memberId, get(oldRank).get(memberId));
                get(oldRank).remove(memberId);
            }
        }
    }

    /**
     * get maximal allowed number of guild members with given {@link Rank}.
     *
     * @param rank - {@link Rank} to get the maximal allowed number of members.
     * @return maximal allowed number of guild members for given {@link Rank}.
     */
    @NotNull Integer getMaxMembersCount(@NotNull Rank rank);

    /**
     * check if given {@link Rank} in this guild is filled to the maximum.
     *
     * @param rank - {@link Rank} to check.
     * @return true if the given {@link Rank} is filled to maximum, false otherwise.
     */
    default @NotNull Boolean isRankFilled(@NotNull Rank rank) {
        return getMaxMembersCount(rank) <= get(rank).size();
    }
}
