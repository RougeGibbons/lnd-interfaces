package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.tilesets;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.battle.map.RouteOrderingComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map.MapNode;

import java.util.Objects;

/**
 * {@link Tileset} interface extension for tilesets representing alive entities' movement routes.
 *
 * @see Tileset
 * @see RouteOrderingComponent
 * @see MapNode
 * @see PairNumberComponent.PairIntComponent
 * @since 1.1.3
 */
public interface Route extends Tileset {
    int SOURCE_TILE_INDEX = 0;

    /**
     * get map nodes' ordering in the route.
     *
     * @return {@link RouteOrderingComponent} containing route ordering data.
     */
    @NotNull RouteOrderingComponent getRouteOrdering();

    /**
     * get start {@link MapNode}.
     *
     * @return start {@link MapNode}.
     */
    default @NotNull MapNode getStart() {
        return Objects.requireNonNull(getMapNodes().get(getStartCoordinates()).getStored());
    }

    /**
     * get destination map node by given distance.
     *
     * @param distance - distance to get destination node from.
     * @return {@link MapNode} representing destination node for given distance.
     */
    default @NotNull MapNode getDestination(@NotNull Integer distance) {
        return Objects.requireNonNull(getMapNodes().get(getDestinationCoordinates(distance)).getStored());
    }

    /**
     * get destination map node.
     *
     * @return destination {@link MapNode}.
     */
    default @NotNull MapNode getDestination() {
        return Objects.requireNonNull(getMapNodes().get(getDestinationCoordinates()).getStored());
    }

    /**
     * get start map node's coordinates.
     *
     * @return {@link PairNumberComponent.PairIntComponent} with start {@link MapNode}'s coordinates.
     */
    default @NotNull PairNumberComponent.PairIntComponent getStartCoordinates() {
        return getRouteOrdering().get(SOURCE_TILE_INDEX);
    }

    /**
     * get destination map node's coordinates.
     *
     * @return {@link PairNumberComponent.PairIntComponent} with destination {@link MapNode} coordinates.
     */
    default @NotNull PairNumberComponent.PairIntComponent getDestinationCoordinates() {
        return getDestinationCoordinates(getLength());
    }

    /**
     * get route's length in map nodes.
     *
     * @return route's length in map nodes (start node not counted).
     */
    default @NotNull Integer getLength() {
        return getRouteOrdering().size() - 1;
    }

    /**
     * get travel cost alive entity must pay to walk through the entire route.
     *
     * @return this route's full movement cost.
     */
    @NotNull Integer getTravelCost();

    /**
     * get destination on given distance from the start point.
     *
     * @param distance - distance to get the destination on.
     * @return {@link PairNumberComponent.PairIntComponent} instance storing given destination node's coordinates.
     */
    default @NotNull PairNumberComponent.PairIntComponent getDestinationCoordinates(@NotNull Integer distance) {
        return getRouteOrdering().get(distance);
    }

    /**
     * see {@link Tileset} description.
     *
     * @return true if start node is occupied, destination node is free and all route nodes are passable, false otherwise.
     */
    @Override
    default @NotNull Boolean isValid() {
        if (!getStart().isOccupied() || getDestination().isOccupied()) {
            return false;
        }

        for (PairNumberComponent.PairIntComponent coordinates : getRouteOrdering()) {
            final MapNode routeNode = getMapNodes().get(coordinates).getStored();
            if ((routeNode == null) || !routeNode.isPassable()) {
                return false;
            }
        }

        return true;
    }

    /**
     * move through this entire route.
     */
    default void walkThrough() {
        walkThrough(getLength());
    }

    /**
     * walk this route on a given amount of steps.
     *
     * @param distance - number of steps to make.
     */
    void walkThrough(@NotNull Integer distance);
}
