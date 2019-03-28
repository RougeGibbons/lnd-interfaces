package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.ai;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.ai.BehaviorFunctionSlot;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.Updateable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleAction;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleStateContext;

import java.util.Map;

/**
 * {@link DecisionMaker} interface extension representing multi-phased AIs
 * (like dungeon bosses etc.).
 *
 * @see DecisionMaker
 * @see Updateable
 * @see BehaviorFunction
 * @see BattleAction
 * @see BattleStateContext
 * @since 1.1.3
 */
public interface MultiPhaseDecisionMaker extends DecisionMaker, Updateable {
    /**
     * get all behaviors available to this AI.
     *
     * @return {@link Map} of {@link Long} to {@link BehaviorFunction}.
     */
    @NotNull MapProviderComponent<Long, BehaviorFunctionSlot> getPhases();

    /**
     * get currently active AI behavior.
     *
     * @return currently active {@link BehaviorFunction}.
     */
    @NotNull BehaviorFunction getActivePhase();

    /**
     * see {@link DecisionMaker} description.
     *
     * @param battleState - {@link BattleStateContext} instance representing current battle state context.
     * @return {@link BattleAction} chosen by this AI.
     */
    @Override
    default @NotNull BattleAction process(@NotNull BattleStateContext battleState) {
        return getActivePhase().process(battleState);
    }
}
