package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.guild.matters;

import org.jetbrains.annotations.NotNull;

/**
 * {@link GuildMatter} interface extension for guild bank access related matters.
 * Guild bank-related matters contain one of the two possible requests (or both simultaneously):
 * 1. retrieve some amount of cash from guild's treasury;
 * 2. retrieve some item from guild's stash.
 *
 * @see GuildMatter
 * @since 1.1.3
 */
public interface GuildBankAccessMatter extends GuildMatter {
    /**
     * get amount of cash to retrieve from guild bank.
     *
     * @return amount of cash to retrieve from guild bank (by default 0).
     */
    default @NotNull Integer getCash() {
        return 0;
    }

    /**
     * get bank id of the bank slot to get the item from.
     *
     * @return bank slot id (matches with guild bank's id when target is the bank itself) or -1 if there's no item to retrieve.
     */
    default @NotNull Long getBankSlotId() {
        return -1L;
    }

    /**
     * get item slot index to retrieve the item from.
     *
     * @return index of the item slot to retrieve the item from or -1 if there's no item to retrieve.
     */
    default @NotNull Integer getItemSlotNumber() {
        return -1;
    }
}
