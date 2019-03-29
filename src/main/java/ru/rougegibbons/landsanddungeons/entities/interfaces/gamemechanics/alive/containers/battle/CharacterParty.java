package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.battle;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;

import java.util.Map;

/**
 * interface representing characters' party.
 *
 * @see AliveEntity
 * @see Raid
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter
 * @see 1.1.3
 */
public interface CharacterParty extends Squad {
    /**
     * converts party into {@link Raid} implementation instance.
     *
     * @return new {@link Raid} implementation instance containing the party it was created from.
     */
    @NotNull Raid toRaid();

    /**
     * gives the leadership to another character in the party.
     *
     * @param newLeaderId - new party leader's id.
     */
    void setLeader(@NotNull Long newLeaderId);

    /**
     * check if the party is a part of the {@link Raid}.
     *
     * @return true if the party is in the {@link Raid}, false otherwise.
     */
    @NotNull Boolean isInRaid();

    /**
     * get numbers of various character roles present in this party.
     *
     * @return {@link Map} {@link Integer} (character role id) to {@link Integer} (role number).
     */
    @NotNull Map<Integer, Integer> getRolesCount();
}
