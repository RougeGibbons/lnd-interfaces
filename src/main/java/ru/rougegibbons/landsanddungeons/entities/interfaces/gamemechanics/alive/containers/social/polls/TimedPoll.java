package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.mixins.Expirable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.mixins.Timed;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

/**
 * {@link Poll} interface extensions for polls that have limited voting time
 * (e.g. matchmaking invtiations or some custom-made guild polls, etc.).
 *
 * @see Poll
 * @see Timed
 * @since 1.1.3
 */
public interface TimedPoll extends Poll, Expirable {
    /**
     * see {@link Timed} description.
     *
     * @return true if poll's timer has expired, false otherwise.
     */
    @Override
    default @NotNull Boolean isExpired() {
        for (Long voterId : getVotes().keySet()) {
            final Vote vote = getVote(voterId);
            if (vote != null && vote.isTimed()) {
                final TimedVote timedVote = (TimedVote) vote;
                if (timedVote.isExpired()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * {@link TimedPoll} extension for polls with custom names.
     *
     * @see TimedPoll
     * @see Named
     * @since 1.1.3
     */
    interface NamedTimedPoll extends TimedPoll, Named {

    }

    /**
     * {@link TimedPoll} extension for polls with custom descriptions.
     *
     * @see TimedPoll
     * @see WithDescription
     * @since 1.1.3
     */
    interface DescriptedTimedPoll extends TimedPoll, WithDescription {

    }

    /**
     * {@link TimedPoll} extension for polls with custom names and descriptions.
     *
     * @see TimedPoll
     * @see Named
     * @see WithDescription
     * @since 1.1.3
     */
    interface NameDescriptionTimedPoll extends TimedPoll, Named, WithDescription {

    }
}
