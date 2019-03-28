package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.matters;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.PrivelegesHolderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacterSocialData;

/**
 * {@link GuildMatter} interface extension representing
 * matters related to changing member's privileges.
 *
 * @see GuildMatter
 * @since 1.1.3
 */
public interface ChangeMemberPrivilegesMatter extends GuildMatter {
    /**
     * get member whose privileges shall be changed.
     *
     * @return {@link UserCharacterSocialData} of the target guild member.
     */
    @NotNull UserCharacterSocialData getTargetMember();

    /**
     * get privileges to be changed with their new values.
     *
     * @return {@link java.util.Map} of {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeKind} to be changed to their new {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.privileges.PrivilegeLevel} as {@link PrivelegesHolderComponent}.
     */
    @NotNull PrivelegesHolderComponent getChangedPrivileges();
}
