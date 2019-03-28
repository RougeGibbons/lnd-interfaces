package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.tilesets;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;

/**
 * {@link Tileset} interface extension representing various alive entities' fields of vision (FoVs).
 *
 * @see Tileset
 * @see PairNumberComponent.PairIntComponent
 * @since 1.1.3
 */
public interface FoVTileset extends Tileset {
    /**
     * recalculate field of vision for given coordinates.
     *
     * @param newPosition - {@link PairNumberComponent.PairIntComponent} instance storing new coordinates to calculate visibility for.
     */
    default void refresh(@NotNull PairNumberComponent.PairIntComponent newPosition) {
        refresh(newPosition.getFirstValue(), newPosition.getSecondValue());
    }

    /**
     * recalculate field of vision for given coordinates.
     *
     * @param newRow    - new row coordinate to calculate visibility for.
     * @param newColumn - new column coordinate to calculate visibility for.
     */
    void refresh(@NotNull Integer newRow, @NotNull Integer newColumn);
}
