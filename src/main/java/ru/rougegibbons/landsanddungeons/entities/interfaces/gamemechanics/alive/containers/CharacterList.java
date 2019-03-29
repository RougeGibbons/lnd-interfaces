package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.AliveEntityRole;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.races.CharacterRace;

import java.util.List;

/**
 * {@link GameEntity} interface extension
 * for lists of the characters owned by user.
 *
 * @see GameEntity
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.core.User
 * @see UserCharacter
 * @see List
 * @see CharacterRace
 * @see AliveEntityRole
 * @since 1.1.3
 */
public interface CharacterList extends GameEntity {
    /**
     * get number of currently created characters.
     *
     * @return number of currently created characters registered.
     */
    @NotNull Integer getCharactersCount();

    /**
     * get character that is currently logged in for this user.
     *
     * @return currently logged in {@link UserCharacter} of null if user is offline.
     */
    @Nullable UserCharacter getActiveCharacter();

    /**
     * get character by its index in the character list.
     *
     * @param characterIndex - index of the character to get.
     * @return {@link UserCharacter} instance if the index is valid and such character exists, null otherwise.
     */
    @Nullable UserCharacter getCharacter(@NotNull Integer characterIndex);

    /**
     * get all currently created characters for this charcter list.
     *
     * @return {@link List} of {@link UserCharacter} instances, each character registered on the character list's owner.
     */
    @NotNull List<UserCharacter> getAllCharacters();

    /**
     * get character list owner id.
     *
     * @return character list owner id.
     */
    @NotNull Long getOwnerId();

    /**
     * create new character of given race, class, gender and name.
     *
     * @param characterRace  - {@link CharacterRace} chosen for the new character.
     * @param characterClass - {@link AliveEntityRole} chosen for the new character.
     * @param gender         - gender of the new character.
     * @param name           - new character's name.
     */
    void createCharacter(@NotNull CharacterRace characterRace,
                         @NotNull AliveEntityRole characterClass,
                         @NotNull Boolean gender,
                         @NotNull String name);

    /**
     * delete character by given index.
     *
     * @param characterIndex - index of the character to delete.
     */
    void deleteCharacter(@NotNull Integer characterIndex);

    /**
     * log character under given index into the game.
     *
     * @param characterIndex - index of the character to log in as.
     */
    void logInCharacter(@NotNull Integer characterIndex);

    /**
     * log out the character that is currently active.
     */
    void logOutCharacter();
}
