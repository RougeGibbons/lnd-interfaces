package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.prototypes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item;

import java.util.Map;

/**
 * interface for item prototypes used to instantiate items and store them in resource files.
 *
 * @see GameEntity
 * @see Item
 * @see ItemPart
 * @since 1.1.3
 */
public interface ItemPrototype extends GameEntity {
    /**
     * get {@link ItemPart}s prototype consists of.
     *
     * @return {@link Map} of {@link ItemPart} to {@link Integer}.
     */
    @NotNull Map<Integer, ItemPart> getParts();

    /**
     * get single {@link ItemPart} if it's present in item parts map.
     *
     * @param partId - id of the {@link ItemPart} to get.
     * @return {@link ItemPart} instance if such id is present in the prototype map, null otherwise.
     */
    default @Nullable ItemPart getPart(@NotNull Integer partId) {
        return getParts().getOrDefault(partId, null);
    }

    /**
     * convert prototype into ingame item.
     *
     * @return {@link Item} interface implementation corresponding to the given prototype.
     */
    @NotNull Item toItem();
}
