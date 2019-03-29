package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.utils;

import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.tilesets.Route;

import java.util.function.BiFunction;


/**
 * {@link BiFunction} interface extension representing algorithms
 * used for building alive entities' movement routes.
 *
 * @see BiFunction
 * @see MapNode
 * @see Route
 * @since 1.1.3
 */
public interface PathfindingAlgorithm extends BiFunction<MapNode, MapNode, Route> {

}
