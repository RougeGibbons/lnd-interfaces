package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.battle;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter;

import java.util.Map;

/**
 * {@link CharacterParty} interface extension representing
 * raids - larger groups of user characters being gathered
 * for the most difficult battles. Each raid contains up to 6 parties.
 *
 * @see CharacterParty
 * @see UserCharacter
 * @since 1.1.3
 */
public interface Raid extends CharacterParty {
    /**
     * get all the raid's parties.
     *
     * @return {@link Map} of {@link Long} to {@link CharacterParty} representing raid's parties.
     */
    @NotNull Map<Long, CharacterParty> getParties();

    /**
     * get a particular raid's party.
     *
     * @param partyId - requested party's id.
     * @return {@link CharacterParty} instance if such party is present in the raid, null otherwise.
     */
    @Nullable CharacterParty getParty(@NotNull Long partyId);

    /**
     * adds new member in particular raid party.
     *
     * @param partyId   - id of the party to add new member to.
     * @param newMember - {@link UserCharacter} party member to add.
     */
    default void addMember(@NotNull Long partyId,
                           @NotNull UserCharacter newMember) {
        final CharacterParty party = getParty(partyId);
        if (party != null && !party.isFull()) {
            party.addMember(newMember);
        }
    }

    /**
     * balances raid parties, redistributing characters between them.
     */
    default void balanceParties() {

    }
}
