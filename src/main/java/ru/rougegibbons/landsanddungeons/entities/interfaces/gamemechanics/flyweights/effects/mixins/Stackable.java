package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.Effect} interface mixin
 * for effects that can be stacked several times.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.Effect
 * @since 1.1.3
 */
public interface Stackable {
    /**
     * get maximal stack size for this effect.
     *
     * @return maximal number of times this effect can be stacked on a single target.
     */
    @NotNull Integer getMaxStackSize();
}
