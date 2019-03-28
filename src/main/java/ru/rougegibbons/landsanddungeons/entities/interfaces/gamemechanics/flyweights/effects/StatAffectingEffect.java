package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects;

import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * {@link Effect} interface extension representing effects affecting alive entities' stats and ratings.
 *
 * @see Effect
 * @since 1.1.3
 */
public interface StatAffectingEffect extends Effect {
    /**
     * get stats affect by this effect.
     *
     * @return set of the stats ids affected by this effect.
     */
    @NotNull Set<Integer> getAffectedStats();

    /**
     * get this effect's affection value.
     *
     * @return this effect's affection value.
     */
    @NotNull Integer getAffection();
}
