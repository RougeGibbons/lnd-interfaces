package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapNodeAdjacenciesComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.PairNumberComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;

/**
 * {@link UpdateableEntity} interface extension representing battle map nodes.
 * Each node is either passable or not. Passable nodes can be occupied
 * by {@link AliveEntity} (user characters or NPCs alike). Each node has up to 4 adjacent
 * nodes (per one from above, right, below and left).
 *
 * @see UpdateableEntity
 * @see GameEntityStorageComponent.MapNodeSlot
 * @see PairNumberComponent.PairIntComponent
 * @see MapNodeAdjacenciesComponent
 * @see AliveEntity
 */
public interface MapNode extends UpdateableEntity {
    /**
     * get {@link AliveEntity} occupying this node if there's any.
     *
     * @return {@link AliveEntity} standing on this node if node is occupied, null otherwise.
     */
    @Nullable AliveEntity getInhabitant();

    /**
     * check if this node's currently occupied.
     *
     * @return true if node's getInhabitant() returns not-null value, false otherwise.
     */
    default @NotNull Boolean isOccupied() {
        return getInhabitant() != null;
    }

    /**
     * check if this node is passable.
     *
     * @return true if this node is passable ({@link AliveEntity} can occupy it), false otherwise.
     */
    @NotNull Boolean isPassable();

    /**
     * check if this node is transparent.
     *
     * @return true if this node is transparent and doesn't obscure {@link AliveEntity}'s field of vision, false otherwise.
     */
    @NotNull Boolean isTransparent();

    /**
     * set this node's passability to given value.
     *
     * @param isPassable - new passability value to set.
     */
    void setIsPassable(@NotNull Boolean isPassable);

    /**
     * try to occupy this node with given stander.
     *
     * @param stander - {@link AliveEntity} instance trying to occupy this node.
     * @return true if stander has successfully occupied this node, false otherwise.
     */
    @NotNull Boolean occupy(@NotNull AliveEntity stander);

    /**
     * free this node from any {@link AliveEntity} occupying it.
     */
    void free();

    /**
     * get {@link MapNode}s adjacent to this node.
     *
     * @return {@link MapNodeAdjacenciesComponent} storing nodes adjacent to this one.
     */
    @NotNull MapNodeAdjacenciesComponent getAdjacentNodes();

    /**
     * get {@link MapNode} adjacent to this one by given direction code.
     *
     * @param direction - direction to get adjacent node from (above, right, below, left).
     * @return {@link MapNode} if the direction is correct and there's adjacent node from that direction, null otehrwise.
     */
    default @Nullable MapNode getAdjacentNode(@NotNull Integer direction) {
        final GameEntityStorageComponent.MapNodeSlot slot =
                getAdjacentNodes().getOrDefault(direction, null);
        return slot == null ? null : slot.getStored();
    }

    /**
     * check if given node is adjacent with this one.
     *
     * @param node - {@link MapNode} to check adjacenccy with.
     * @return true if given node is adjacent with this one, false otherwise.
     */
    default @NotNull Boolean isAdjacentTo(@NotNull MapNode node) {
        for (Integer direction : getAdjacentNodes().keySet()) {
            final GameEntityStorageComponent.MapNodeSlot slot = getAdjacentNodes().get(direction);
            if (!slot.isEmpty()) {
                final MapNode adjacent = slot.getStored();
                if (node.equals(adjacent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * set adjacent nodes from given values.
     *
     * @param adjacentNodes - {@link MapNodeAdjacenciesComponent} storing adjacency data to set.
     */
    default void setAdjacentNodes(@NotNull MapNodeAdjacenciesComponent adjacentNodes) {
        getAdjacentNodes().clear();
        getAdjacentNodes().putAll(adjacentNodes);
    }

    /**
     * get this node's coordinates.
     *
     * @return {@link PairNumberComponent.PairIntComponent} storing this node's coordinates.
     */
    @NotNull PairNumberComponent.PairIntComponent getCoordinates();

    /**
     * get one of this node's coordinates (X or Y).
     *
     * @param isX - key determining which coordinate we shall return.
     * @return if isX is true - this node's X coordinate value, Y coordinate value otherwise.
     */
    default @NotNull Integer getCoordinate(@NotNull Boolean isX) {
        return isX ? getCoordinates().getFirstValue() : getCoordinates().getSecondValue();
    }

    /**
     * get heuristic value to given node.
     *
     * @param target - {@link MapNode} to calculate heuristic value to.
     * @return calculated heuristic value.
     */
    @NotNull Integer getH(@NotNull MapNode target);
}
