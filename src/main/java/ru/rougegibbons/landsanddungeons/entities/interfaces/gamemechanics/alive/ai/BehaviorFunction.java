package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.ai;

import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleAction;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleStateContext;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ContextProcessor;

/**
 * {@link GameEntity} and {@link ContextProcessor} interfaces flyweight extension
 * representing single AI behavior.
 *
 * @see GameEntity
 * @see ContextProcessor
 * @see BattleStateContext
 * @see BattleAction
 * @since 1.1.3
 */
public interface BehaviorFunction extends GameEntity,
        ContextProcessor<BattleStateContext, BattleAction> {
}
