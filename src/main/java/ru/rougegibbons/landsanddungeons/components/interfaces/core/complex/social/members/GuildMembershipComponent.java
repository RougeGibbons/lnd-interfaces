package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.members;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.PrivelegesHolderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.social.Rank;

/**
 * {@link PackableComponent} interface extension storing character's guild data.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.Guild
 * @see PackableComponent
 * @see Rank
 * @see PrivelegesHolderComponent
 * @see 1.1.3
 */
public interface GuildMembershipComponent extends PackableComponent {
    /**
     * get guild id character belongs to.
     *
     * @return guild id.
     */
    @NotNull Long getGuildId();

    /**
     * get character's rank in the guild.
     *
     * @return character's rank.
     */
    @NotNull Rank getRank();

    /**
     * get character's priveleges in the guild.
     *
     * @return character's guild priveleges as {@link PrivelegesHolderComponent} instance.
     */
    @NotNull PrivelegesHolderComponent getPriveleges();
}
