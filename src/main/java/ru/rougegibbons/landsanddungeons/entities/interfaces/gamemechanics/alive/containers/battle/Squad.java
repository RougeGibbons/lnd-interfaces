package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.battle;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.WithLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.AliveEntitiesGroup;

/**
 * {@link AliveEntitiesGroup} interface extension
 * for battle-oriented {@link AliveEntity} groups,
 * like raids, character parties or monster packs.
 *
 * @see WithLevel
 * @see AliveEntity
 * @see AliveEntitiesGroup
 * @see Raid
 * @see CharacterParty
 * @since 1.1.3
 */
public interface Squad extends AliveEntitiesGroup, WithLevel {
    /**
     * get maximal allowed members number for that kind of squad.
     *
     * @return maximal allowed characters number for a single squad of that kind.
     */
    @NotNull Integer getMaximalSize();

    /**
     * check if the squad is full.
     *
     * @return true if the characters number in the party is equal to the maximal allowed, false otherwise.
     */
    default @NotNull Boolean isFull() {
        return getMembers().size() == getMaximalSize();
    }

    /**
     * get the party leader.
     *
     * @return {@link AliveEntity} representing party leader.
     */
    @NotNull AliveEntity getLeader();

    /**
     * check if the given character is party leader.
     *
     * @param characterId - supposed party leader's id.
     * @return true if the party leader's id is equal to the given one, false otherwise.
     */
    @NotNull Boolean isLeader(@NotNull Long characterId);

    /**
     * check if all squad members are dead.
     *
     * @return true if all squad members are dead, false otherwise.
     */
    default @NotNull Boolean areAllDead() {
        for (AliveEntity member : getMembers()) {
            if (member != null) {
                if (!member.isDead()) {
                    return false;
                }
            }
        }
        return true;
    }
}
