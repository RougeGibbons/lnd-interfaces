package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.WithLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;

import java.util.List;

/**
 * interface representing some {@link AliveEntity} union.
 *
 * @see UpdateableEntity
 * @see WithLevel
 * @since 1.1.3
 */
public interface AliveEntitiesGroup extends UpdateableEntity {
    /**
     * get all group members.
     *
     * @return {@link List} containing all members of this group.
     */
    @NotNull List<AliveEntity> getMembers();

    /**
     * get the group member by id.
     *
     * @param memberId - id of the member to get.
     * @return {@link AliveEntity} as requested group member or null if there's no member with such id in the group.
     */
    @Nullable AliveEntity getMember(@NotNull Long memberId);

    /**
     * add given member to the group.
     *
     * @param member - member to add.
     */
    void addMember(@NotNull AliveEntity member);

    /**
     * remove given member from the group.
     *
     * @param member - member to remove.
     */
    void removeMember(@NotNull AliveEntity member);

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
}
