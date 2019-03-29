package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.tilesets;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.map.MapNodesContainer;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;

/**
 * {@link GameEntity} interface extension representing generic tileset.
 * Tileset is a {@link MapNode}s collection united by some reason
 * (area effect's affection zone, alive entity's movement route, etc.).
 *
 * @see GameEntity
 * @see MapNodesContainer
 * @see MapNode
 * @since 1.1.3
 */
public interface Tileset extends GameEntity {
    /**
     * get number of map nodes stored in this tileset.
     *
     * @return number of map nodes stored in this tileset.
     */
    default @NotNull Integer getTilesCount() {
        return getMapNodes().size();
    }

    /**
     * get tileset's contents.
     *
     * @return {@link MapNodesContainer} instance representing this tileset's contents.
     */
    @NotNull MapNodesContainer getMapNodes();

    /**
     * check if given map node is in this tileset.
     *
     * @param node - {@link MapNode} to check.
     * @return true if this map node is in this tileset, false otherwise.
     */
    default @NotNull Boolean isInTileset(@NotNull MapNode node) {
        return isInTileset(node.getCoordinate(true), node.getCoordinate(false));
    }

    /**
     * check if given coordinates belong to this tileset.
     *
     * @param coordinates - coordinates to check.
     * @return true if given coordinates match ones stored in this tileset, false otherwise.
     */
    default @NotNull Boolean isInTileset(@NotNull PairNumberComponent.PairIntComponent coordinates) {
        return isInTileset(coordinates.getFirstValue(), coordinates.getSecondValue());
    }

    /**
     * check if given coordinates are in this tileset.
     *
     * @param rowCoordinate    - row coordinate to check.
     * @param columnCoordinate - column coordinate to check.
     * @return true if given coordinates match ones stored in tileset's keyset, false otherwise.
     */
    default @NotNull Boolean isInTileset(@NotNull Integer rowCoordinate,
                                         @NotNull Integer columnCoordinate) {
        for (PairNumberComponent.PairIntComponent coordinates : getMapNodes().keySet()) {
            if (coordinates.getFirstValue().equals(rowCoordinate)
                    && coordinates.getSecondValue().equals(columnCoordinate)) {
                return true;
            }
        }

        return false;
    }

    /**
     * check if this tileset is valid or not.
     *
     * @return true if the tileset is valid, false otherwise.
     */
    @NotNull Boolean isValid();
}
