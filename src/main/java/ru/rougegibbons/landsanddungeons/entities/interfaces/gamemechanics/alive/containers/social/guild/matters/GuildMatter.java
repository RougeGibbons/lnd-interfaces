package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.matters;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.mixins.WithAuthor;

/**
 * {@link UpdateableEntity} interface extension representing various guild matters.
 *
 * @see UpdateableEntity
 * @see WithAuthor
 * @since 1.1.3
 */
public interface GuildMatter extends UpdateableEntity, WithAuthor {
    /**
     * get id of the guild this matter belongs to.
     *
     * @return guild id.
     */
    @NotNull Long getGuildId();

    /**
     * check if the matter is resolved (the solution is made).
     *
     * @return true if there's a solution for this matter, false otherwise.
     */
    @NotNull Boolean isResolved();

    /**
     * check if this matter's solution is implemented.
     *
     * @return true if the solution is implemented, false otherwise.
     */
    @NotNull Boolean isImplemented();

    /**
     * check if the matter is canceled.
     *
     * @return true if the matter is canceled.
     */
    @NotNull Boolean isCanceled();

    /**
     * cancels the given matter.
     */
    void cancel();
}
