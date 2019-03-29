package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.members;

import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacterSocialData;

import java.util.Map;

/**
 * {@link PackableComponent} interface extension
 * for storing guild members' {@link UserCharacterSocialData}.
 *
 * @see Map
 * @see UserCharacterSocialData
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.Guild
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social.Rank
 * @since 1.1.3
 */
public interface GuildMembersDataComponent extends
        Map<Long, UserCharacterSocialData>, PackableComponent {

}
