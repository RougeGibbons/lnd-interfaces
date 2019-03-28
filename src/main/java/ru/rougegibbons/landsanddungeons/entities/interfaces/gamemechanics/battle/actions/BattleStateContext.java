package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.AliveEntitiesGroup;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.BattleMap;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.Context;

/**
 * {@link Context} interface extension representing battle actions context.
 *
 * @see AliveEntity
 * @see AliveEntitiesGroup
 * @see BattleMap
 * @see Context
 * @since 1.1.3
 */
public interface BattleStateContext extends Context {
    /**
     * @return
     */
    @NotNull AliveEntity getSelf();

    /**
     * @return
     */
    @NotNull AliveEntitiesGroup getAllies();

    /**
     * @return
     */
    @NotNull AliveEntitiesGroup getEnemies();

    /**
     * @return
     */
    @NotNull BattleMap getMap();
}
