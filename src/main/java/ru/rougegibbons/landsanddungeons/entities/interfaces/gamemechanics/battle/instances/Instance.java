package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.instances;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.WithLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.battle.Squad;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.log.BattleLog;

/**
 * {@link UpdateableEntity} interface extension representing
 * various in-game instances (e.g. dungeons, raids, PvP battlefields, etc.).
 *
 * @see UpdateableEntity
 * @see WithLevel
 * @see PairNumberComponent.PairLongComponent
 * @see Squad
 * @see BattleLog
 * @since 1.1.3
 */
public interface Instance extends UpdateableEntity, WithLevel {
    /**
     * get instance's game mode.
     *
     * @return instance's game mode code.
     */
    @NotNull Integer getGameMode();

    /**
     * get number of rooms in this instance.
     *
     * @return total number of battlefields in this instance.
     */
    @NotNull Integer getRoomsCount();

    /**
     * get cleared rooms count.
     *
     * @return number of won battles.
     */
    @NotNull Integer getClearedRoomsCount();

    /**
     * check if this instance is successfully cleared.
     *
     * @return true if the instance is cleared, false otherwise.
     */
    default @NotNull Boolean isCleared() {
        return getClearedRoomsCount().equals(getRoomsCount());
    }

    /**
     * check if this instance is failed.
     *
     * @return true if the instance is failed, false otherwise.
     */
    @NotNull Boolean isFailed();

    /**
     * get this instance's battle log length.
     *
     * @return number of entries stored in this instance's {@link BattleLog}.
     */
    default @NotNull Integer getBattleLogLength() {
        return getBattleLog().getSize();
    }

    /**
     * get this instance's battle log.
     *
     * @return this instance's {@link BattleLog} storing this instance's battle history.
     */
    @NotNull BattleLog getBattleLog();

    /**
     * get IDs of the squads fighting in this instance.
     *
     * @return {@link PairNumberComponent.PairLongComponent} instance storing fighting squad's IDs.
     */
    @NotNull PairNumberComponent.PairLongComponent getSquadIds();

    /**
     * get one of the fighting squads by its ID.
     *
     * @param partyId - id of the {@link Squad} to get.
     * @return requested {@link Squad} if such id presents among the squads fighting in this instance, null otherwise.
     */
    @Nullable Squad getSquad(@NotNull Long partyId);

    /**
     * get one of the fighting squads using side index.
     *
     * @param sideIndex - index of the side (team) to get the squad by.
     * @return requested {@link Squad} or null if the given index is invalid.
     */
    @Nullable Squad getSquad(@NotNull Integer sideIndex);

    /**
     * provide battle participants with earned rewards.
     */
    void giveRewards();
}
