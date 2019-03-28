package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.actions;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.ActionResult;

import java.util.List;

/**
 * {@link PropertyComponent} interface extension for storing battle log entries.
 *
 * @see PropertyComponent
 * @see List
 * @see ActionResult
 * @since 1.1.3
 */
public interface BattleLogEntriesHolderComponent extends PropertyComponent, List<ActionResult> {

}
