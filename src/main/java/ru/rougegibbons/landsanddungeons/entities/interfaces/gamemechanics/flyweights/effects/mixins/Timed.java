package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.Effect} interface mixin
 * for effects with limited activity time.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.Effect
 * @since 1.1.3
 */
public interface Timed {
    /**
     * get effect's duration.
     *
     * @return effect's duration.
     */
    @NotNull Integer getDuration();
}
