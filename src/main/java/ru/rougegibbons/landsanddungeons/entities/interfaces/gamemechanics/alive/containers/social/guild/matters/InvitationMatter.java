package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.matters;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls.Vote;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacterSocialData;

/**
 * {@link GuildMatter} extension for guild invitation matters.
 *
 * @see GuildMatter
 * @see UserCharacterSocialData
 * @since 1.1.3
 */
public interface InvitationMatter extends GuildMatter {
    /**
     * get social data of the candidate to invite.
     *
     * @return {@link UserCharacterSocialData} of the candidate to invite.
     */
    @NotNull UserCharacterSocialData getCandidate();

    /**
     * get candidate's decision (to be invited candidate must confirm the invitation).
     *
     * @return current candidate's decision state as {@link Vote.VotingResult}.
     */
    @NotNull Vote.VotingResult getCandidateDecision();

    /**
     * {@link InvitationMatter} extension for the user-sent
     * request to invite him/her to the guild.
     *
     * @see InvitationMatter
     * @since 1.1.3
     */
    interface InvitationRequestMatter extends InvitationMatter {
        /**
         * see {@link InvitationMatter} description.
         *
         * @return for user-sent requests the request author is the candidate to invite.
         */
        @Override
        default @NotNull UserCharacterSocialData getCandidate() {
            return getAuthor();
        }

        /**
         * see {@link InvitationMatter} description.
         *
         * @return for user-sent requests candidate's response is initially set to affirmative.
         */
        @Override
        default @NotNull Vote.VotingResult getCandidateDecision() {
            return Vote.VotingResult.VR_CONFIRM;
        }
    }
}
