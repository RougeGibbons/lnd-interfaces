package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.Context;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Ability;

/**
 * {@link Context} interface extension, representing single battle action's context.
 *
 * @see BattleAction
 * @see Context
 * @since 1.1.3
 */
public interface ActionContext extends Context {
    /**
     * get action sender's {@link MapNode}.
     *
     * @return {@link MapNode} where sender stands on.
     */
    @NotNull MapNode getSender();

    /**
     * {@link ActionContext} interface extension for actions containing targets.
     *
     * @see ActionContext
     * @since 1.1.3
     */
    interface TargetedActionContext extends ActionContext {
        /**
         * get action's target {@link MapNode}.
         *
         * @return {@link MapNode} the action is targeted at.
         */
        @NotNull MapNode getTarget();
    }

    /**
     * {@link TargetedActionContext} interface extension representing actions with used {@link Ability}.
     *
     * @see Ability
     * @see TargetedActionContext
     * @since 1.1.3
     */
    interface AbilityUseActionContext extends TargetedActionContext {
        /**
         * @return
         */
        @NotNull Ability getUsedAbility();
    }
}
