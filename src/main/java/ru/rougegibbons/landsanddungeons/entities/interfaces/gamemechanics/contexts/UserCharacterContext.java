package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter;

/**
 * {@link Context} interface extension representing
 * contexts storing data about single {@link UserCharacter}.
 *
 * @see Context
 * @see UserCharacter
 * @since 1.1.3
 */
public interface UserCharacterContext extends Context {
    /**
     * get {@link UserCharacter} data.
     *
     * @return {@link UserCharacter} implementation instance.
     */
    @NotNull UserCharacter getCharacter();
}
