package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.matters;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacterSocialData;

/**
 * {@link GuildMatter} extension representing character kick requests.
 *
 * @see GuildMatter
 * @see UserCharacterSocialData
 * @since 1.1.3
 */
public interface KickMatter extends GuildMatter {
    /**
     * get social data of the candidate to kick.
     *
     * @return {@link UserCharacterSocialData} of the candidate to kick.
     */
    @NotNull UserCharacterSocialData getCandidate();

    interface SelfKickMatter extends KickMatter {
        /**
         * see {@link GuildMatter} description.
         *
         * @return self-kicking is always resolved already.
         */
        @Override
        default @NotNull Boolean isResolved() {
            return true;
        }

        /**
         * see {@link GuildMatter} description.
         *
         * @return self-kicking can't be canceled.
         */
        @Override
        default @NotNull Boolean isCanceled() {
            return false;
        }

        /**
         * see {@link GuildMatter} description.
         */
        @Override
        default void cancel() {

        }
    }
}
