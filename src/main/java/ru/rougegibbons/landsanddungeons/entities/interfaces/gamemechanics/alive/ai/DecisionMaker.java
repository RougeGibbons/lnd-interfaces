package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.ai;

import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleAction;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleStateContext;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ContextProcessor;

/**
 * {@link GameEntity} interface extension representing an NPC's AI.
 * Default version contains only one behavior.
 *
 * @see GameEntity
 * @see ContextProcessor
 * @see BattleAction
 * @see BattleStateContext
 * @since 1.1.3
 */
public interface DecisionMaker extends GameEntity,
        ContextProcessor<BattleStateContext, BattleAction> {

}
