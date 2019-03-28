package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.instances;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.log.BattleLog;

/**
 * {@link UpdateableEntity} interface extension representing battlefields
 * where user character fight monsters and each other.
 *
 * @see Instance
 * @see BattleLog
 * @since 1.1.3
 */
public interface Battlefield extends UpdateableEntity {
    /**
     * get this battle's game mode.
     *
     * @return this battle's game mode.
     */
    @NotNull Integer getGameMode();

    /**
     * check if this battle is finished.
     *
     * @return true if this battle's winning or loosing conditions were reached, false otherwise.
     */
    default @NotNull Boolean isFinished() {
        return isVictory() || isDefeat();
    }

    /**
     * check if victory condition has been reached.
     *
     * @return true if victory condition has been reached, false otherwise.
     */
    @NotNull Boolean isVictory();

    /**
     * check if defeat condition was reached.
     *
     * @return true if defeat condition was reached, false otherwise.
     */
    @NotNull Boolean isDefeat();

    /**
     * get this battlefield's battle log.
     *
     * @return {@link BattleLog} implementation instance representing this battlefield's log.
     */
    @NotNull BattleLog getLog();
}
