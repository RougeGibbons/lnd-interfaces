package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.races;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

import java.util.Map;

/**
 * {@link GameEntity} interface extension representing character races.
 *
 * @see Tradition
 * @see GameEntity
 * @see Named
 * @see WithDescription
 * @since 1.1.3
 */
public interface CharacterRace extends GameEntity, Named, WithDescription {
    /**
     * get all racial traditions available.
     *
     * @return {@link Long} to {@link Tradition} {@link Map}.
     */
    @NotNull Map<Long, Tradition> getTraditions();

    /**
     * get racial tradition by its id if such tradition is among the racial ones.
     *
     * @param traditionId - id of the tradition to get.
     * @return requested {@link Tradition} instance if such id is in the {@link Map}, null otherwise.
     */
    default @Nullable Tradition getTradition(@NotNull Long traditionId) {
        return getTraditions().getOrDefault(traditionId, null);
    }
}
