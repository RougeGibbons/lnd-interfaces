package ru.rougegibbons.landsanddungeons.entities.interfaces.models;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * {@link EntityModel} interface extension representing ingame item model.
 *
 * @see EntityModel
 * @since 1.1.3
 */
public interface ItemModel extends EntityModel {
    /**
     * get item's blueprint.
     *
     * @return item's blueprint (map of the item part ids).
     */
    @NotNull Map<Integer, Long> getBlueprint();
}
