package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.mixins;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * interface mixin for such equipable items that represent various weapons.
 *
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.EquipableItem
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.items.Item
 * @see Equipable
 * @since 1.1.3
 */
public interface Weapon {
    int MELEE_DISTANCE = 1;

    /**
     * get weapon kind (sword, axe, dagger, staff, pole, mace, bow, crossbow, firearms, etc.).
     *
     * @return weapon kind.
     */
    @NotNull Integer getKind();

    /**
     * get weapon damage as single digit (damage dealt per one concrete strike).
     *
     * @return strike damage.
     */
    @NotNull Integer getDamage();

    /**
     * get weapon damage as min-max pair.
     *
     * @return weapon damage.
     */
    @NotNull List<Integer> getDamageRange();

    /**
     * get maximal hit distance for the weapon.
     *
     * @return weapon's hit distance.
     */
    @NotNull Integer getRange();

    /**
     * check if the weapon is ranged.
     *
     * @return true if weapon's range is higher than melee distance, false otherwise.
     */
    default @NotNull Boolean isRanged() {
        return getRange() > MELEE_DISTANCE;
    }

    /**
     * check if the weapon is two-handed. Two-handed weapons block offhand slot when equipped.
     *
     * @return true if the weapon is two-handed, false otherwise.
     */
    @NotNull Boolean isTwoHanded();

    /**
     * check if the weapon may be equipped in offhand slot.
     *
     * @return true if the weapon may be equipped in offhand slot, false otherwise.
     */
    @NotNull Boolean isOffhand();

    /**
     * check if the weapon may be equipped in mainhand slot.
     *
     * @return true if the weapon may be equipped in mainhand slot, false otherwise.
     */
    @NotNull Boolean isMainhand();
}
