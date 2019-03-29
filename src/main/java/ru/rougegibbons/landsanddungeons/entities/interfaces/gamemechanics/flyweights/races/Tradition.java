package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.races;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.UpdateableAffectorOwnerEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

/**
 * {@link UpdateableAffectorOwnerEntity} interface extension
 * representing traditions - features developed by racial culture for a long time.
 *
 * @see UpdateableAffectorOwnerEntity
 * @see Named
 * @see WithDescription
 * @since 1.1.3
 */
public interface Tradition extends UpdateableAffectorOwnerEntity, Named, WithDescription {
    /**
     * check if this tradition needs to be unlocked.
     *
     * @return true if the tradition needs unlocking, false otherwise (by default false).
     */
    default @NotNull Boolean isUnlockable() {
        return false;
    }
}
