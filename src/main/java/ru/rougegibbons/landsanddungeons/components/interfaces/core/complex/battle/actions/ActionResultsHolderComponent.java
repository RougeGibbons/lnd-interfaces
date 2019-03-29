package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.actions;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.ActionResultPart;

import java.util.List;
import java.util.Queue;

/**
 * {@link PropertyComponent} interface extension representing action result parts sequence.
 *
 * @see PropertyComponent
 * @see ActionResultPart
 * @see List
 * @see Queue
 * @since 1.1.3
 */
public interface ActionResultsHolderComponent extends PropertyComponent,
        List<ActionResultPart>, Queue<ActionResultPart> {
}
