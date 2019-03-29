package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression.PerkRequirementsHolderComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.AffectorOwnerEntity;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.contexts.UserCharacterContext;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.Named;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.mixins.WithDescription;

/**
 * {@link AffectorOwnerEntity} extension representing character classes' perks.
 * Each perk can affect either character's stats or skills.
 *
 * @see AffectorOwnerEntity
 * @see Named
 * @see WithDescription
 * @since 1.1.3
 */
public interface Perk extends AffectorOwnerEntity, Named, WithDescription {
    /**
     * check if this perk is available for given character's points investments.
     *
     * @param context - {@link UserCharacterContext} instance storing character data to check perk availability with.
     * @return true if the character's progression meets all perk's requirements, false otherwise.
     */
    default @NotNull Boolean isUnlocked(@NotNull UserCharacterContext context) {
        return getRequirements().process(context).getOutcome();
    }

    /**
     * get perk's requirements.
     *
     * @return perk's requirements.
     */
    @NotNull PerkRequirementsHolderComponent getRequirements();
}
