package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.Guild;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

/**
 * {@link GameEntity} interface extension representing various polls,
 * created by both users (e.g. various guild-related stuff) and system (e.g. matchmaking).
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter
 * @see Guild
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.instances.Instance
 * @since 1.1.3
 */
public interface Poll extends GameEntity {
    /**
     * get poll creation reason code.
     *
     * @return poll creation reason as {@link PollReason} object.
     */
    @NotNull PollReason getReason();

    /**
     * get this poll's votes.
     *
     * @return this poll's votes as {@link MapProviderComponent.VotesContainer}.
     */
    @NotNull MapProviderComponent.VotesContainer getVotes();

    /**
     * get {@link Vote} by its voter's id.
     *
     * @param voterId - voter's id to get the vote by.
     * @return {@link Vote} implementation instance if such voter's id is present in this poll, null otherwise.
     */
    default @Nullable Vote getVote(@NotNull Long voterId) {
        return getVotes().containsKey(voterId) ? getVotes().get(voterId).getStored() : null;
    }

    /**
     * get voting result as {@link Vote.VotingResult}.
     *
     * @return if the poll is closed - final result (either VR_CONFIRM or VR_DENY), otherwise - VR_UNDEFINED.
     */
    default @NotNull Vote.VotingResult getOutcome() {
        Vote.VotingResult result = Vote.VotingResult.VR_UNDEFINED;

        if (!isOpen()) {
            int confirmCount = 0;
            int denyCount = 0;
            int refrainedCount = 0;
            for (Long voterId : getVotes().keySet()) {
                final Vote vote = getVote(voterId);
                if (vote != null && !((vote.getResult() == Vote.VotingResult.VR_UNDEFINED)
                        || (vote.getResult() == Vote.VotingResult.VR_REFRAINED))) {
                    if (vote.getResult() == Vote.VotingResult.VR_CONFIRM) {
                        ++confirmCount;
                    } else {
                        ++denyCount;
                    }
                } else {
                    ++refrainedCount;
                }
            }
            if ((refrainedCount > (getVotes().size() / 2 - 1)) || (confirmCount == denyCount)) {
                result = Vote.VotingResult.VR_UNDEFINED;
            } else {
                if (confirmCount > denyCount) {
                    result = Vote.VotingResult.VR_CONFIRM;
                } else {
                    result = Vote.VotingResult.VR_DENY;
                }
            }
        }

        return result;
    }

    /**
     * get votes count of given {@link Vote.VotingResult}.
     *
     * @param votingResult - voting result to count votes by.
     * @return number of votes with given voting result.
     */
    default @NotNull Integer getVotesCount(@NotNull Vote.VotingResult votingResult) {
        Integer votesCount = 0;

        for (Long voterId : getVotes().keySet()) {
            final Vote vote = getVote(voterId);
            if ((vote != null) && (vote.getResult() == votingResult)) {
                ++votesCount;
            }
        }

        return votesCount;
    }

    /**
     * check if the voting is finished.
     *
     * @return true if the outcome is not VR_UNDEFINED, false otherwise.
     */
    default @NotNull Boolean isFinished() {
        return getOutcome() != Vote.VotingResult.VR_UNDEFINED;
    }

    /**
     * check if this poll is open for voting.
     *
     * @return true if this poll if open for voting, false otherwise.
     */
    @NotNull Boolean isOpen();

    /**
     * close the poll for voting.
     */
    void close();

    /**
     * enumeration describing various {@link Poll} creation reasons.
     *
     * @see Poll
     * @since 1.1.3
     */
    enum PollReason {
        // undefined and custom polls
        PR_UNDEFINED(0),
        PR_CUSTOM(1),

        // guild-related issues
        // guild lifecycle issues
        PR_GUILD_INVITE_MEMBER(2),
        PR_GUILD_KICK_MEMBER(3),
        PR_GUILD_PROMOTE_MEMBER(4),
        PR_GUILD_DISRANK_MEMBER(5),
        PR_GUILD_CHANGE_FEE(6),

        // guild policies issues
        PR_GUILD_CHANGE_POLICY_POLLS(7),
        PR_GUILD_CHANGE_POLICY_FEE(8),
        PR_GUILD_CHANGE_POLICY_INVITE(9),
        PR_GUILD_CHANGE_POLICY_KICK(10),
        PR_GUILD_CHANGE_POLICY_RANKS(11),

        // matchmaking issues
        PR_INSTANCE_READINESS_CHECK(12),
        PR_INSTANCE_MATCHMAKING_INVITE(13);

        private final Integer reasonId;

        /**
         * default enumeration object's constructor.
         *
         * @param reasonId - poll creation reason digital code.
         */
        PollReason(@NotNull Integer reasonId) {
            this.reasonId = reasonId;
        }

        /**
         * get poll creation reason code.
         *
         * @return poll creation reason code.
         */
        @NotNull Integer getReasonId() {
            return reasonId;
        }

        /**
         * check if reason is undefined.
         *
         * @return true if poll creation reason code is equal to PR_UNDEFINED reason code, false otherwise.
         */
        @NotNull Boolean isUndefinedReason() {
            return reasonId.equals(PR_UNDEFINED.reasonId);
        }

        /**
         * checks if the reason is custom.
         *
         * @return true if poll creation reason code is equal to PR_CUSTOM reason code, false otherwise.
         */
        @NotNull Boolean isCustomReason() {
            return reasonId.equals(PR_CUSTOM.reasonId);
        }

        /**
         * @return
         */
        @NotNull Boolean isGuildReason() {
            return (reasonId > PR_CUSTOM.reasonId)
                    && (reasonId < PR_INSTANCE_READINESS_CHECK.reasonId);
        }

        /**
         * check if the reason is related with guild's lifecycle matters.
         *
         * @return true if poll creation reason code lies within guil lifecycle-related range, false otherwise.
         */
        @NotNull Boolean isGuildLifecycleReason() {
            return (reasonId > PR_CUSTOM.reasonId)
                    && (reasonId < PR_GUILD_CHANGE_POLICY_POLLS.reasonId);
        }

        /**
         * check if the reason is related to guild's policies changes.
         *
         * @return true if poll creation reason code lies within guild policies-related range, false otherwise.
         */
        @NotNull Boolean isGuildPolicyReason() {
            return (reasonId > PR_GUILD_CHANGE_FEE.reasonId)
                    && (reasonId < PR_INSTANCE_READINESS_CHECK.reasonId);
        }

        /**
         * check if the reason is related to matchmaking reasons.
         *
         * @return true if poll creation reason code lies within matchmaking-related range, false otherwise.
         */
        @NotNull Boolean isMatchmakingReason() {
            return (reasonId >= PR_INSTANCE_READINESS_CHECK.reasonId)
                    && (reasonId <= PR_INSTANCE_MATCHMAKING_INVITE.reasonId);
        }
    }

    /**
     * {@link Poll} interface extension for polls with custom names.
     *
     * @see Poll
     * @see Named
     * @since 1.1.3
     */
    interface NamedPoll extends Poll, Named {

    }

    /**
     * {@link Poll} interface extension for polls with custom descriptions.
     *
     * @see Poll
     * @see WithDescription
     * @since 1.1.3
     */
    interface DescriptivePoll extends Poll, WithDescription {

    }

    /**
     * {@link Poll} interface extension for polls with custom names and descriptions.
     *
     * @see Poll
     * @see Named
     * @see WithDescription
     * @since 1.1.3
     */
    interface NameDescriptionPoll extends Poll, Named, WithDescription {

    }
}
