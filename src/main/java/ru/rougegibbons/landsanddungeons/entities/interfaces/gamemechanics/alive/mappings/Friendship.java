package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.mappings;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.polls.Vote;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacterSocialData;

/**
 * {@link Vote} extension representing a social
 * relationship between two user characters.
 *
 * @see Vote
 * @see UserCharacterSocialData
 * @since 1.1.3
 */
public interface Friendship extends Vote {
    /**
     * get {@link UserCharacterSocialData} on the character who sent the request.
     *
     * @return sender's {@link UserCharacterSocialData}.
     */
    @NotNull UserCharacterSocialData getSenderFriend();

    /**
     * get {@link UserCharacterSocialData} on the character who accepted the request.
     *
     * @return target's {@link UserCharacterSocialData}.
     */
    @NotNull UserCharacterSocialData getTargetFriend();

    /**
     * check if the friendship request is confirmed.
     *
     * @return true if the request was confirmed, false otherwise.
     */
    default @NotNull Boolean isConfirmed() {
        return getResult() == VotingResult.VR_CONFIRM;
    }

    /**
     * check if the friendship request was rejected.
     *
     * @return true if the request was rejected, false otherwise.
     */
    default @NotNull Boolean isRejected() {
        return getResult() == VotingResult.VR_DENY;
    }

    /**
     * checks if the friendship request is a pending one.
     *
     * @return true if the request is neither confirmed nor rejected, false otherwise.
     */
    default @NotNull Boolean isPending() {
        return !isConfirmed() && !isRejected();
    }

    /**
     * confirm the friendship offer if it is not confirmed or rejected already.
     */
    void confirm();

    /**
     * reject the friendship offer if it is not confirmed or rejected already.
     */
    void reject();
}
