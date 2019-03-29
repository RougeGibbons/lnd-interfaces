package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions;

import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.packable.PackableSenderEvent;

/**
 * {@link PackableSenderEvent} interface extension representing atomic {@link ActionResult} parts.
 *
 * @see PackableSenderEvent
 * @see ActionResult
 * @since 1.1.3
 */
public interface ActionResultPart extends PackableSenderEvent<MapNode> {

}
