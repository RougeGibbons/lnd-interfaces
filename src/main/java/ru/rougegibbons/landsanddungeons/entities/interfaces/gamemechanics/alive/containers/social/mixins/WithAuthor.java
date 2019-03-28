package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacterSocialData;

/**
 * interface mixin for entities that may have author (like chat posts, polls, etc.).
 *
 * @see UserCharacterSocialData
 * @since 1.1.3
 */
public interface WithAuthor {
    /**
     * get author's data.
     *
     * @return {@link UserCharacterSocialData} implementation instance, containing data about this entity's author.
     */
    @NotNull UserCharacterSocialData getAuthor();
}
