package ru.rougegibbons.landsanddungeons.backends.interfaces.resources;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.backends.interfaces.Backend;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item;
import ru.rougegibbons.landsanddungeons.entities.interfaces.models.ItemModel;

/**
 * {@link Backend} interface extension for backends responsible
 * for game resources handling, such as items data, monsters data, etc.
 *
 * @param <T> - any class implementing {@link GameEntity} interface.
 * @see GameEntity
 * @see Item
 * @see AliveEntity
 * @since 1.1.3
 */
public interface GameResourcesBackend<T extends GameEntity> extends Backend {
    /**
     * make entity from data stored under given id.
     *
     * @param resourceId - stored resource id to use for entity creation.
     * @return {@link T} instance if instantiation was successful or null if there's no such id.
     */
    @Nullable T makeEntity(@NotNull Long resourceId);

    /**
     * make entity from data stored under given id with given level.
     *
     * @param resourceId - stored resource id to use for entity creation.
     * @param level      - level of created entity.
     * @return {@link T} instance if instantiation was successful or null if there's no such id.
     */
    @Nullable T makeEntity(@NotNull Long resourceId, @NotNull Integer level);

    /**
     * {@link GameResourcesBackend} interface extension for backends dealing with game items data.
     *
     * @see Item
     * @since 1.1.3
     */
    interface ItemsBackend extends GameResourcesBackend<Item> {
        /**
         * makes {@link Item} instance from given data model.
         *
         * @param model - {@link ItemModel} instance storing item data.
         * @return {@link Item} instance if deserialization was successful or null if data model is corrupted.
         */
        @Nullable Item makeEntity(@NotNull ItemModel model);
    }

    /**
     * {@link GameResourcesBackend} interface extension for backends dealing with {@link AliveEntity} instances.
     *
     * @see AliveEntity
     * @since 1.1.3
     */
    interface AliveEntityBackend extends GameResourcesBackend<AliveEntity> {

    }
}
