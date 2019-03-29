package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ContextProcessor;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.ProcessingResult;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Ability;

/**
 * {@link ProcessingResult} interface extension representing AI decision-making
 * outcomes and user character actions performed during the battle.
 *
 * @see ProcessingResult
 * @see ContextProcessor
 * @see MapNode
 * @since 1.1.3
 */
public interface BattleAction extends ProcessingResult,
        ContextProcessor<ActionContext, ActionResult> {
    /**
     * get {@link MapNode} where stands alive entity that initiated this action.
     *
     * @return {@link MapNode} instance where the one initiated this action stands on.
     */
    @NotNull MapNode getSender();

    /**
     * {@link BattleAction} interface extension representing battle actions that have target.
     *
     * @see BattleAction
     * @since 1.1.3
     */
    interface TargetedBattleAction extends BattleAction {
        /**
         * get action's target.
         *
         * @return {@link MapNode} action's target stands on.
         */
        @NotNull MapNode getTarget();
    }

    /**
     * {@link TargetedBattleAction} interface extension representing actions involving abilities' usage.
     *
     * @see TargetedBattleAction
     * @see Ability
     * @since 1.1.3
     */
    interface AbilityUsageAction extends TargetedBattleAction {
        /**
         * get {@link Ability} used in this action.
         *
         * @return {@link Ability} used in this action.
         */
        @NotNull Ability getAbility();
    }
}
