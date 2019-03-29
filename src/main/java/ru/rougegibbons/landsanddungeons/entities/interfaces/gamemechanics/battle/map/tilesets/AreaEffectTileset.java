package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.tilesets;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.actions.ActionResultsHolderComponent;

/**
 * {@link Tileset} interface extension for tilesets representing area effects' target zones.
 *
 * @see Tileset
 * @see ActionResultsHolderComponent
 * @since 1.1.3
 */
public interface AreaEffectTileset extends Tileset {
    /**
     * apply given effects to this tileset.
     *
     * @param events - {@link ActionResultsHolderComponent} to apply to this tileset.
     */
    void applyEffects(@NotNull ActionResultsHolderComponent events);
}
