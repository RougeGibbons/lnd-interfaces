package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression.CharacterProgressionComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.social.members.GuildMembershipComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.collections.ItemStorageAggregatorComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.Levelable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.AliveEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.containers.social.Friendlist;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.races.CharacterRace;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers.CharacterBelongings;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers.CharacterDoll;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers.ItemStorage;

import java.util.List;

/**
 * {@link AliveEntity} interface extension for classes representing user characters.
 *
 * @see AliveEntity
 * @see Levelable
 * @see CharacterRace
 * @see ItemStorage
 * @see ItemStorageAggregatorComponent
 * @see CharacterBelongings
 * @see CharacterProgressionComponent
 * @see GuildMembershipComponent
 * @since 1.1.3
 */
public interface UserCharacter extends AliveEntity, Levelable {
    /**
     * get character race.
     *
     * @return {@link CharacterRace} implementation.
     */
    @NotNull CharacterRace getRace();

    /**
     * get character gender.
     *
     * @return true if character is male, false if character is female.
     */
    @NotNull Boolean getGender();

    /**
     * get this character's progression.
     *
     * @return {@link CharacterProgressionComponent} instance storing this character's progression.
     */
    @NotNull CharacterProgressionComponent getCharacterProgression();

    /**
     * get character's full level.
     *
     * @return see {@link CharacterProgressionComponent} description.
     */
    @Override
    default @NotNull Integer getLevel() {
        return getCharacterProgression().getLevel();
    }

    /**
     * see {@link Levelable} description.
     *
     * @return see {@link Levelable} description.
     */
    @Override
    default @NotNull Integer getProgressInt() {
        return getCharacterProgression().getProgressInt();
    }

    /**
     * see {@link Levelable} description.
     *
     * @return see {@link Levelable} description.
     */
    @Override
    default @NotNull Float getProgressFloat() {
        return getCharacterProgression().getProgressFloat();
    }

    /**
     * see {@link Levelable} description.
     *
     * @return see {@link Levelable} description.
     */
    @Override
    default @NotNull List<Integer> getExperiencePair() {
        return getCharacterProgression().getExperiencePair();
    }

    /**
     * see {@link Levelable} description.
     *
     * @return see {@link Levelable} description.
     */
    @Override
    default @NotNull Integer getCurrentExperience() {
        return getCharacterProgression().getCurrentExperience();
    }

    /**
     * see {@link Levelable} description.
     *
     * @return see {@link Levelable} description.
     */
    @Override
    default @NotNull Integer getLevelUpCap() {
        return getCharacterProgression().getLevelUpCap();
    }

    /**
     * see {@link Levelable} description.
     *
     * @param amount - experience point to add to entity's current experience.
     */
    @Override
    default void addExperience(@NotNull Integer amount) {
        getCharacterProgression().addExperience(amount);
    }

    /**
     * get character's belongings (equipment, inventory, bank and cash).
     *
     * @return {@link CharacterBelongings} implementation instance containing data about items and cash belonging to the character.
     */
    @NotNull CharacterBelongings getBelongings();

    /**
     * get {@link ItemStorage} by given index.
     *
     * @param bagIndex - number of bag to get.
     * @return {@link ItemStorage} or its extension implementation if such index is present in the inventory, null otherwise.
     */
    default @Nullable ItemStorage getBag(@NotNull Integer bagIndex) {
        return getBelongings().getInventory().getStorage(bagIndex);
    }

    /**
     * get character's inventory.
     *
     * @return {@link ItemStorageAggregatorComponent} instance.
     */
    default @NotNull ItemStorageAggregatorComponent.InventoryComponent getBags() {
        return getBelongings().getInventory();
    }

    /**
     * get equipped items container.
     *
     * @return {@link CharacterDoll} instance containing equipped items.
     */
    default @NotNull CharacterDoll getEquipment() {
        return getBelongings().getEquipment();
    }

    /**
     * get character's friendlist.
     *
     * @return {@link Friendlist} implementation instance containing character's friends.
     */
    @NotNull Friendlist getFriendlist();

    /**
     * get character's social data.
     *
     * @return character's social data as {@link UserCharacterSocialData} instance.
     */
    @NotNull UserCharacterSocialData getSocialData();

    /**
     * check if the character belongs to some guild.
     *
     * @return true if the character has {@link GuildMembershipComponent} among its components, false otherwise.
     */
    default @NotNull Boolean isInGuild() {
        return getGuildMembership() != null;
    }

    /**
     * get access to character's {@link GuildMembershipComponent} if the character is in guild.
     *
     * @return {@link GuildMembershipComponent} representing characte's guild membership data if character is in guild, null otherwise.
     */
    default @Nullable GuildMembershipComponent getGuildMembership() {
        return getSocialData().getGuild();
    }
}
