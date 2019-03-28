package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.Guild;

/**
 * interface representing various polling results.
 *
 * @see UpdateableEntity
 * @see Guild
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.mappings.Friendship
 * @since 1.1.3
 */
public interface Vote extends GameEntity {
    /**
     * get id of the user character who's performed this voting.
     *
     * @return {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter} id.
     */
    @NotNull Long getVoterId();

    /**
     * get current voting result.
     *
     * @return {@link VotingResult} object representing current voting result.
     */
    @NotNull VotingResult getResult();

    /**
     * make voting, setting vote from initial undefined value to given result. Voting permitted only once per object's lifetime.
     *
     * @param vote - given {@link VotingResult} value. Can't be VR_UNDEFINED.
     */
    void vote(@NotNull VotingResult vote);

    /**
     * check if this vote is timed or not.
     *
     * @return true if it's {@link TimedVote} instance, false otherwise.
     */
    default @NotNull Boolean isTimed() {
        return false;
    }

    /**
     * enumeration describing possible voting outcomes (not voted, agreed, denied, refrained).
     *
     * @since 1.1.3
     */
    enum VotingResult {
        VR_UNDEFINED,
        VR_CONFIRM,
        VR_DENY,
        VR_REFRAINED
    }
}
