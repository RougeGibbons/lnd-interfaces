package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.containers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.affectors.generic.AffectorComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.collections.StatListPropertyComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.number.mutable.EntityStatPropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter;

/**
 * {@link ItemContainer} interface extension representing equipment that's put on the character.
 *
 * @see GameEntityStorageComponent
 * @see UserCharacter
 * @see ItemContainer
 * @see GameEntityStorageComponent.ItemSlot
 * @see AffectorComponent
 * @see StatListPropertyComponent
 * @see EntityStatPropertyComponent
 * @since 1.1.3
 */
public interface CharacterDoll extends ItemContainer {
    /**
     * get raw (unaffected by stat bonuses) damage value.
     *
     * @return {@link AffectorComponent} storing raw damage value.
     */
    @NotNull AffectorComponent getRawDamage();

    /**
     * get total defense (without wearer's bonuses) given by equipped items.
     *
     * @return {@link AffectorComponent} storing total defense value given by the equipment.
     */
    @NotNull AffectorComponent getTotalDefense();

    /**
     * get total stat bonuses given by the equipment.
     *
     * @return {@link StatListPropertyComponent} instance storing equipment's stat bonuses.
     */
    @NotNull StatListPropertyComponent getTotalStatsBonus();

    /**
     * get total equipment bonus to the particular stat.
     *
     * @param statId - index of the stat to get bonus for.
     * @return {@link EntityStatPropertyComponent} with total equipment bonus to the particular stat or null if the index is invalid.
     */
    default @Nullable EntityStatPropertyComponent getStatBonus(@NotNull Integer statId) {
        return getTotalStatsBonus().getOrDefault(statId, null);
    }

    /**
     * get average equipment score representing total equipment quality.
     *
     * @return average equipment score.
     */
    @NotNull Integer getAverageEquipmentScore();

    /**
     * tries to equip the item from given inventory slot.
     *
     * @param toEquip - {@link GameEntityStorageComponent.ItemSlot} storing the item to equip.
     */
    void equip(@NotNull GameEntityStorageComponent.ItemSlot toEquip);

    /**
     * tries to equip the item from given bag slot to given equipment slot.
     *
     * @param toEquip - {@link GameEntityStorageComponent.ItemSlot} storing the item to equip.
     * @param slotId - index of the equipment slot to put the item to.
     */
    void equip(@NotNull GameEntityStorageComponent.ItemSlot toEquip, @NotNull Integer slotId);
}
