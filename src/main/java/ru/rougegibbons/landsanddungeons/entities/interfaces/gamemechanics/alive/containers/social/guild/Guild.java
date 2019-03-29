package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.GuildMattersHolderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.GuildRankNamingsComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.members.GuildRosterComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.Levelable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers.GuildBank;

/**
 * {@link UpdateableEntity} interface extension representing
 * large {@link UserCharacter} groups, joined by social reasons.
 *
 * @see UpdateableEntity
 * @see Levelable
 * @see GuildRankNamingsComponent
 * @see GuildRosterComponent
 * @see UserCharacter
 * @since 1.1.3
 */
public interface Guild extends UpdateableEntity, Levelable {
    /**
     * get guild roster storing all its members.
     *
     * @return all guild members as {@link GuildRosterComponent}
     */
    @NotNull GuildRosterComponent getRoster();

    /**
     * get the group member by id.
     *
     * @param memberId - id of the member to get.
     * @return {@link UserCharacter} as requested group member or null if there's no member with such id in the group.
     */
    @Nullable UserCharacter getMember(@NotNull Long memberId);

    /**
     * add given member to the group.
     *
     * @param member - member to add.
     */
    void addMember(@NotNull UserCharacter member);

    /**
     * remove given member from the group.
     *
     * @param member - member to remove.
     */
    void removeMember(@NotNull UserCharacter member);

    /**
     * remove member from the group by given id.
     *
     * @param memberId - id of the member to remove.
     */
    void removeMember(@NotNull Long memberId);

    /**
     * remove all the members from the group and mark the group for removal.
     */
    void disband();

    /**
     * get {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social.Rank} names used in this guild.
     *
     * @return {@link GuildRankNamingsComponent} instance containing guild rank names used in this guild.
     */
    @NotNull GuildRankNamingsComponent getRankNames();

    /**
     * get current guild leader.
     *
     * @return {@link UserCharacter} instance representing current guild leader.
     */
    @NotNull UserCharacter getLeader();

    /**
     * set new guild leader.
     *
     * @param leaderId - id of the new guild leader.
     */
    void setLeader(@NotNull Long leaderId);

    /**
     * set new guild leader.
     *
     * @param leader - new leader {@link UserCharacter} instance.
     */
    default void setLeader(@NotNull UserCharacter leader) {
        setLeader(leader.getId());
    }

    /**
     * access guild bank's contents.
     *
     * @return {@link GuildBank} implementation instance storing this guild's bank data.
     */
    @NotNull GuildBank getBank();

    /**
     * get current state of guild matters.
     *
     * @return {@link GuildMattersHolderComponent} instance storing guild matters data.
     */
    @NotNull GuildMattersHolderComponent getMatters();
}
