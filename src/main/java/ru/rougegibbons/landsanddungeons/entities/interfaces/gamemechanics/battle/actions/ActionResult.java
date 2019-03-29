package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ProcessingResult;
import ru.rougegibbons.landsanddungeons.events.interfaces.core.SenderEvent;

import java.util.Queue;

/**
 * {@link ProcessingResult} interface extension representing battle action performing result.
 *
 * @see ProcessingResult
 * @see SenderEvent
 * @see MapNode
 * @see ActionResultPart
 * @see Queue
 * @since 1.1.3
 */
public interface ActionResult extends ProcessingResult, SenderEvent<MapNode> {
    /**
     * get events spawned by the action.
     *
     * @return {@link Queue} of {@link ActionResultPart} containing all atomic events spawned during performing the action.
     */
    @NotNull Queue<ActionResultPart> getEvents();
}
