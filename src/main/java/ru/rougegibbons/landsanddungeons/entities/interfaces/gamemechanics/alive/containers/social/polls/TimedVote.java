package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.mixins.Timed;

/**
 * {@link Vote} interface extension representing votes that have limited time to pay attention to.
 *
 * @see Vote
 * @see Timed
 * @since 1.1.3
 */
public interface TimedVote extends Vote, Timed {
    /**
     * see {@link Timed} description.
     *
     * @return true if there's no time remaining to vote, false otherwise.
     */
    @Override
    default @NotNull Boolean isExpired() {
        return getTimer().isElapsed() &&
                (getResult() == VotingResult.VR_UNDEFINED
                        || getResult() == VotingResult.VR_REFRAINED);
    }

    /**
     * see {@link Vote} description.
     *
     * @return always true.
     */
    @Override
    default @NotNull Boolean isTimed() {
        return true;
    }
}
