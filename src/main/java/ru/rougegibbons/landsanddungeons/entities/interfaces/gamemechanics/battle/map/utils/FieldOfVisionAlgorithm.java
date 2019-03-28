package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.utils;

import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.tilesets.FoVTileset;

import java.util.function.Function;

/**
 * {@link Function} interface extension representing
 * algorithms used for calculating alive entity's field of vision.
 *
 * @see Function
 * @see MapNode
 * @see FoVTileset
 * @since 1.1.3
 */
public interface FieldOfVisionAlgorithm extends Function<MapNode, FoVTileset> {

}
