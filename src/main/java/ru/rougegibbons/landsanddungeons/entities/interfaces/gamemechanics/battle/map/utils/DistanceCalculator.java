package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.utils;

import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;

import java.util.function.BiFunction;

/**
 * {@link BiFunction} interface extension representing algorithms
 * used for calculating heuristic values between two {@link MapNode}s.
 *
 * @see MapNode
 * @see BiFunction
 * @since 1.1.3
 */
public interface DistanceCalculator extends BiFunction<MapNode, MapNode, Integer> {

}
