package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.Alive;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.WithLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.AliveEntityRole;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;

/**
 * The top-level interface representing all alive entities
 * that may be met in-game: NPCs, user characters, monsters.
 *
 * @see UpdateableEntity
 * @see WithLevel
 * @see Alive
 * @see Named
 * @see AliveEntityRole
 * @since 1.1.3
 */
public interface AliveEntity extends UpdateableEntity, WithLevel, Alive, Named {
    /**
     * get the alive entitiy's role.
     *
     * @return {@link AliveEntityRole} instance representing its role.
     */
    @NotNull AliveEntityRole getRole();

    /**
     * check if this alive entity is controlled by AI.
     *
     * @return true if this entity is controlled by AI, false otherwise.
     */
    default @NotNull Boolean isAiControlled() {
        return false;
    }

    /**
     * checks if alive entity is a member of some characters group.
     *
     * @return true if alive entity is in some group, false otherwise.
     */
    @NotNull Boolean isInGroup();

    /**
     * get character's group id.
     *
     * @return -1 if character is not in any group, group id otherwise.
     */
    @NotNull Long getGroupId();
}
