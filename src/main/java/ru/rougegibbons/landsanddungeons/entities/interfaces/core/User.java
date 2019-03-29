package ru.rougegibbons.landsanddungeons.entities.interfaces.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.Packable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.CharacterList;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter;

/**
 * interface representing user account entity.
 *
 * @see GameEntity
 * @see Packable
 * @see UserCharacter
 * @see CharacterList
 * @since 1.1.3
 */
public interface User extends GameEntity {
    /**
     * get user login.
     *
     * @return user login.
     */
    @NotNull String getLogin();

    /**
     * get user password.
     *
     * @return user password.
     */
    @NotNull String getPassword();

    /**
     * get the user character logged in game right now.
     *
     * @return {@link UserCharacter} instance if user is logged in as one of his/her characters, null otherwise.
     */
    @Nullable UserCharacter getActiveCharacter();

    /**
     * checks if the user is logged in the game right now.
     *
     * @return true if user has the character logged in at the moment.
     */
    default @NotNull Boolean isInGame() {
        return getActiveCharacter() != null;
    }

    /**
     * get list of characters belonging to the user.
     *
     * @return {@link CharacterList} instance containing user characters.
     */
    @NotNull CharacterList getCharacterList();
}
