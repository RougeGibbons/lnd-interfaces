package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.ai;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.BehaviorComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.ai.BehaviorFunction;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleAction;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.BattleStateContext;

import java.util.Objects;

/**
 * {@link BehaviorComponent} interface extension representing AI behavioral function container.
 *
 * @see BehaviorComponent
 * @see BehaviorFunction
 * @see BattleStateContext
 * @see BattleAction
 * @since 1.1.3
 */
public interface BehaviorFunctionSlot extends BehaviorComponent<BattleStateContext, BattleAction>,
        GameEntityStorageComponent<BehaviorFunction> {
    /**
     * see {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ContextProcessor} description.
     *
     * @param context - given context.
     * @return {@link BattleAction} chosen basing on given context's state.
     */
    @Override
    default @NotNull BattleAction process(@NotNull BattleStateContext context) {
        return Objects.requireNonNull(getStored()).process(context);
    }
}
