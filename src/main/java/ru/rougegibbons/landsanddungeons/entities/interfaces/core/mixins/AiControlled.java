package ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.ai.DecisionMaker;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleAction;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleStateContext;

/**
 * interface mixin for entities under some AI's control.
 *
 * @see DecisionMaker
 * @see BattleAction
 * @see BattleStateContext
 * @since 1.1.3
 */
public interface AiControlled {
    /**
     * get controlling AI.
     *
     * @return {@link DecisionMaker} instance representing an AI controlling this entity.
     */
    @NotNull DecisionMaker getAi();

    /**
     * get an action picked by AI.
     *
     * @param battleState - current battle state.
     * @return chosen {@link BattleAction}.
     */
    default @NotNull BattleAction makeDecision(@NotNull BattleStateContext battleState) {
        return getAi().process(battleState);
    }
}
