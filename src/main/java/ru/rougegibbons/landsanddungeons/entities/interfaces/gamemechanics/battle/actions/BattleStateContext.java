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
     * get the acting {@link AliveEntity}.
     *
     * @return acting {@link AliveEntity} instance.
     */
    @NotNull AliveEntity getSelf();

    /**
     * get acting entity's allies.
     *
     * @return {@link AliveEntitiesGroup} storing acting entity's allies.
     */
    @NotNull AliveEntitiesGroup getAllies();

    /**
     * get acting entity's enemies.
     *
     * @return {@link AliveEntitiesGroup} storing acting entity's enemies.
     */
    @NotNull AliveEntitiesGroup getEnemies();

    /**
     * get battlefield's map.
     *
     * @return {@link BattleMap} instance representing battlefield's map.
     */
    @NotNull BattleMap getMap();
}
