package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

import java.util.Map;

/**
 * {@link GameEntity} extension representing
 * an {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity}
 * role in its most generic form, suiable both for NPCs and user characters.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter
 * @see Ability
 * @see GameEntity
 * @see Named
 * @see WithDescription
 * @since 1.1.3
 */
public interface AliveEntityRole extends GameEntity, Named, WithDescription {
    /**
     * get available abilities collection.
     *
     * @return {@link Map} {@link Long} to {@link Ability} representing available skillset.
     */
    @NotNull Map<Long, Ability> getAbilities();

    /**
     * get role id (currently active one if the role has multiple ids).
     *
     * @return role id.
     */
    @NotNull Long getRoleId();

    /**
     * get {@link Ability} by its id.
     *
     * @param abilityId - id of the ability to get.
     * @return {@link Ability} instance if its present in the abilities map or null otherwise.
     */
    default @Nullable Ability getAbility(@NotNull Long abilityId) {
        return getAbilities().getOrDefault(abilityId, null);
    }
}
