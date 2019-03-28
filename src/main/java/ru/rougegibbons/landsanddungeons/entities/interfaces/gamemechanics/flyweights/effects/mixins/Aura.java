package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.mixins;

import org.jetbrains.annotations.NotNull;

/**
 * {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.Effect} interface implementations
 * interface mixin for aura-like effects.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects.Effect
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.tilesets.TilesetShape
 * @since 1.1.3
 */
public interface Aura {
    /**
     * get effect's range.
     *
     * @return effect's range
     */
    @NotNull Integer getRange();

    /**
     * get effect's area shape. Shape shall be one of the listed in {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.tilesets.TilesetShape},
     *
     * @return effect's area shape.
     */
    @NotNull Integer getShape();
}
