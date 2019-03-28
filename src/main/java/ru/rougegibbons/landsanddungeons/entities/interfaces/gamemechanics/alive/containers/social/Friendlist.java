package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.mappings.Friendship;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacterSocialData;

import java.util.List;

/**
 * {@link GameEntity} extension representing
 * {@link UserCharacter} contacts (friends) list.
 *
 * @see GameEntity
 * @see UserCharacter
 * @see UserCharacterSocialData
 * @see Friendship
 * @since 1.1.3
 */
public interface Friendlist extends GameEntity {
    /**
     * get total friends number.
     *
     * @return total friends number in the list.
     */
    @NotNull Integer getFriendsCount();

    /**
     * get number of friends that are currently online.
     *
     * @return number of online friends.
     */
    @NotNull Integer getOnlineFriendsCount();

    /**
     * send a {@link Friendship} invitation to the given friend.
     *
     * @param target - character to send the invitation to.
     */
    void sendInvitation(@NotNull UserCharacter target);

    /**
     * get pending invitations list.
     *
     * @return {@link List} containing pending {@link Friendship} invitations.
     */
    @NotNull List<Friendship> getPendingInvitations();

    /**
     * get list of confirmed friends.
     *
     * @return {@link List} of {@link UserCharacterSocialData}.
     */
    @NotNull List<UserCharacterSocialData> getFriends();
}
