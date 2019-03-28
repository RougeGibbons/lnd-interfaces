package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.AliveEntitiesGroup;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.Context;

/**
 * {@link Context} interface extension representing contexts used in effects processing.
 *
 * @see Context
 * @see AliveEntity
 * @since 1.1.3
 */
public interface EffectUsageContext extends Context {
    /**
     * get used effect's id.
     *
     * @return used effect's id.
     */
    @NotNull Long getEffectId();

    /**
     * get effect's sender.
     *
     * @return {@link AliveEntity} instance reresenting effect's sender.
     */
    @NotNull AliveEntity getSender();

    /**
     * {@link EffectUsageContext} interface extension representing
     * contexts with {@link AliveEntity} as target.
     *
     * @see EffectUsageContext
     * @see AliveEntity
     * @see AliveEntitiesGroup
     * @since 1.1.3
     */
    interface AliveEntityTargetContext extends EffectUsageContext {
        /**
         * get effect's target.
         *
         * @return {@link AliveEntity} representing effect's target.
         */
        @NotNull AliveEntity getTarget();

        /**
         * get sender's allies.
         *
         * @return {@link AliveEntitiesGroup} instance storing sender's allies data.
         */
        @NotNull AliveEntitiesGroup getAllies();

        /**
         * get sender's enemies.
         *
         * @return {@link AliveEntitiesGroup} instance storing sender's enemies data.
         */
        @NotNull AliveEntitiesGroup getEnemies();
    }

    /**
     * {@link EffectUsageContext} interface extension
     * representing contexts with {@link MapNode} as target.
     *
     * @see EffectUsageContext
     * @see MapNode
     * @since 1.1.3
     */
    interface MapNodeTargetContext extends EffectUsageContext {
        /**
         * get effect's target.
         *
         * @return {@link MapNode} representing effect's target.
         */
        @NotNull MapNode getTarget();
    }

    /**
     * {@link AliveEntityTargetContext} interface extension representing
     * contexts where sender and target is the same {@link AliveEntity}.
     *
     * @see AliveEntityTargetContext
     * @see AliveEntity
     * @since 1.1.3
     */
    interface SelfCastContext extends AliveEntityTargetContext {
        /**
         * see {@link AliveEntityTargetContext} description.
         *
         * @return getSender() value representing effect's target.
         */
        @Override
        default @NotNull AliveEntity getTarget() {
            return getSender();
        }
    }
}
