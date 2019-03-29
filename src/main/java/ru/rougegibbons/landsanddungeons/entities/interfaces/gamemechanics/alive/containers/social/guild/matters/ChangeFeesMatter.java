package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.matters;

import org.jetbrains.annotations.NotNull;

/**
 * {@link GuildMatter} interface extension representing matters related to guild fees.
 *
 * @see GuildMatter
 * @since 1.1.3
 */
public interface ChangeFeesMatter extends GuildMatter {
    /**
     * get suggested fee level.
     *
     * @return suggested fee level.
     */
    @NotNull Integer getSuggestedFee();
}
