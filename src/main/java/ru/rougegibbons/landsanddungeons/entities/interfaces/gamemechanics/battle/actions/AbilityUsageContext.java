package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.utils.PathfindingAlgorithm;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.Context;

/**
 * {@link Context} interface extension representing battle ability usage context.
 *
 * @see Context
 * @see MapNode
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Ability
 * @see PathfindingAlgorithm
 * @since 1.1.3
 */
public interface AbilityUsageContext extends Context {
    /**
     * get used ability ID.
     *
     * @return used ability ID.
     */
    @NotNull Long getAbilityId();

    /**
     * get sender's map node.
     *
     * @return {@link MapNode} instance sender stands on.
     */
    @NotNull MapNode getSender();

    /**
     * get target map node.
     *
     * @return {@link MapNode} instance ability will be applied to.
     */
    @NotNull MapNode getTarget();

    /**
     * get battle pathfinding algorithm used for this map.
     *
     * @return {@link PathfindingAlgorithm} used for this map.
     */
    @NotNull PathfindingAlgorithm getPathfindingAlgorithm();
}
