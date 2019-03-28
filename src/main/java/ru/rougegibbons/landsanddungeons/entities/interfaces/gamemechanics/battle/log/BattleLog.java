package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.log;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.actions.BattleLogEntriesHolderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.ActionResult;

/**
 * {@link GameEntity} interface extension representing battle logs storing various battle data.
 *
 * @see BattleLogEntriesHolderComponent
 * @see ActionResult
 * @since 1.1.3
 */
public interface BattleLog extends GameEntity {
    /**
     * get this log's size.
     *
     * @return this log's entries number.
     */
    default @NotNull Integer getSize() {
        return get().size();
    }

    /**
     * get log's contents.
     *
     * @return this log's contents as {@link BattleLogEntriesHolderComponent} implementation instance.
     */
    @NotNull BattleLogEntriesHolderComponent get();

    /**
     * get log entry by given index.
     *
     * @param entryIndex - index to get log entry by.
     * @return - {@link ActionResult} implementation instance storing requested entry data if given index is valid, null otherwise.
     */
    default @Nullable ActionResult getEntry(@NotNull Integer entryIndex) {
        return (entryIndex < 0) || (entryIndex >= getSize()) ? null : get().get(entryIndex);
    }

    /**
     * append given entry to this log.
     *
     * @param entry - {@link ActionResult} implementation instance representing entry to append to this log.
     */
    default void addEntry(@NotNull ActionResult entry) {
        get().add(entry);
    }

    /**
     * clear this log's contents.
     */
    default void clear() {
        get().clear();
    }
}
