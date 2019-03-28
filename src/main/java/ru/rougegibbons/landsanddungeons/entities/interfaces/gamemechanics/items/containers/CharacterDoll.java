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
     * @return
     */
    @NotNull AffectorComponent getRawDamage();

    /**
     * @return
     */
    @NotNull AffectorComponent getTotalDefense();

    /**
     * @return
     */
    @NotNull StatListPropertyComponent getTotalStatsBonus();

    /**
     * @param statId
     * @return
     */
    default @Nullable EntityStatPropertyComponent getStatBonus(@NotNull Integer statId) {
        return getTotalStatsBonus().getOrDefault(statId, null);
    }

    /**
     * @return
     */
    @NotNull Integer getAverageEquipmentScore();

    /**
     * @param toEquip
     */
    void equip(@NotNull GameEntityStorageComponent.ItemSlot toEquip);

    /**
     * @param toEquip
     * @param slotId
     */
    void equip(@NotNull GameEntityStorageComponent.ItemSlot toEquip, @NotNull Integer slotId);
}
