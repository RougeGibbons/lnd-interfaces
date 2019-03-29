package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.effects;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.GameEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.battle.actions.EffectUsageContext;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

/**
 * {@link GameEntity} interface extension representing ingame effects
 * that may be put on characters ((de)buffs, DoTs/HoTs, auras, etc.).
 * Implements Flyweight pattern. Bound context shall be
 * a {@link EffectUsageContext} instance.
 *
 * @see GameEntity
 * @see Named
 * @see WithDescription
 * @see EffectUsageContext
 * @since 1.1.3
 */
public interface Effect extends GameEntity, Named, WithDescription {
    /**
     * check if this effect is stackable.
     *
     * @return true if this effect is stackable false otherwise (false by default).
     */
    default @NotNull Boolean isStackable() {
        return false;
    }

    /**
     * check if this effect is an aura.
     *
     * @return true if this effect is an aura, false otherwise (false by default).
     */
    default @NotNull Boolean isAura() {
        return false;
    }

    /**
     * check if this effect is timed.
     *
     * @return true if this effect is timed, false otherwise (false by default).
     */
    default @NotNull Boolean isTimed() {
        return false;
    }

    /**
     * check if this effect is permanent.
     *
     * @return inverted value of isTimed() method.
     */
    default @NotNull Boolean isPermanent() {
        return !isTimed();
    }

    /**
     * implement an effect.
     *
     * @param context - {@link EffectUsageContext} instance storing effect usage data.
     */
    void implement(@NotNull EffectUsageContext context);
}
