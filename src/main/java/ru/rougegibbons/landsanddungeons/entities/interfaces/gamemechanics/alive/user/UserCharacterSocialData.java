package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.members.GuildMembershipComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.WithLevel;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.Friendlist;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.Guild;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.AliveEntityRole;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.races.CharacterRace;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;

/**
 * {@link GameEntity} interface extension for entities containing
 * light version of character's data to be used
 * in the social components (like guilds, friendlists, etc.)
 *
 * @see GameEntity
 * @see Named
 * @see WithLevel
 * @see AliveEntityRole
 * @see CharacterRace
 * @see UserCharacter
 * @see Guild
 * @see Friendlist
 * @since 1.1.3
 */
public interface UserCharacterSocialData extends GameEntity, Named, WithLevel {
    /**
     * get character id.
     *
     * @return id of the character this instance is pointing at.
     */
    @NotNull Long getCharacterId();

    /**
     * get name of the character's game class.
     *
     * @return name of the character's game class.
     */
    @NotNull String getCharacterRole();

    /**
     * get character's race name.
     *
     * @return character's race name.
     */
    @NotNull String getRace();

    /**
     * get character's gender.
     *
     * @return true if character is male, false if character is female.
     */
    @NotNull Boolean getGender();

    /**
     * check if character is online.
     *
     * @return true of the character this instance is pointing at is online, false otherwise.
     */
    @NotNull Boolean isOnline();

    /**
     * toggle character's online status.
     */
    void toggleIsOnline();

    /**
     * increase stored character level value.
     */
    void increaseLevel();

    /**
     * get access to guild membership controls if character's in some guild.
     *
     * @return {@link GuildMembershipComponent} providing access to character's gulid controls if character belongs to some guild, null otherwise.
     */
    @Nullable GuildMembershipComponent getGuild();

    /**
     * check if this character is in guild.
     *
     * @return true if character has {@link GuildMembershipComponent} component, false otherwise.
     */
    default @NotNull Boolean isInGuild() {
        return getGuild() != null;
    }
}
