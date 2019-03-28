package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.map.MapNodeRowComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.WithLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;

/**
 * {@link UpdateableEntity} interface extension representing battle maps.
 *
 * @see UpdateableEntity
 * @see WithLevel
 * @see MapNode
 * @see MapNodeRowComponent
 * @see AliveEntity
 * @since 1.1.3
 */
public interface BattleMap extends UpdateableEntity, WithLevel {
    /**
     * get battle map row by row index.
     *
     * @param rowIndex - index of the row to get.
     * @return {@link MapNodeRowComponent} innstance representing requested map nodes row, null if the index is incorrect.
     */
    @Nullable MapNodeRowComponent getRow(@NotNull Integer rowIndex);

    /**
     * get map node by its coordinates (row and column indices).
     *
     * @param rowIndex    - index of the row requested node is in.
     * @param columnIndex - index of the requested node inside the row.
     * @return {@link MapNode} instance representing requested node or null if at least one of the coordinates is invalid.
     */
    default @Nullable MapNode getTile(@NotNull Integer rowIndex,
                                      @NotNull Integer columnIndex) {
        if (rowIndex < 0 || columnIndex < 0) {
            return null;
        }
        final MapNodeRowComponent row = getRow(rowIndex);
        return (row == null) || (columnIndex >= row.size())
                ? null : row.get(columnIndex).getStored();
    }

    /**
     * get requested map node's inhabitant.
     *
     * @param rowIndex    - row index of the requested map node.
     * @param columnIndex - index of the requested node inside its row.
     * @return {@link AliveEntity} instance if there's an NPC or user character standing on the requested node, null otherwise or if at least one coordinate is invalid.
     */
    default @Nullable AliveEntity getInhabitant(@NotNull Integer rowIndex,
                                                @NotNull Integer columnIndex) {
        final MapNode tile = getTile(rowIndex, columnIndex);
        return tile == null ? null : tile.getInhabitant();
    }

    /**
     * get this battle map's dimensions.
     *
     * @return {@link PairNumberComponent.PairIntComponent} instance storing this battle map's dimensions.
     */
    @NotNull PairNumberComponent.PairIntComponent getSize();
}
