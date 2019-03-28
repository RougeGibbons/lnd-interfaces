package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.MapProviderComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers.ModifiableSingleNumberComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;

/**
 * {@link MapProviderComponent} interface extension representing
 * {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter}'s progression
 * in corresponding {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.PerkBranch},
 * storing skill points invested in each {@link ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Perk}.
 *
 * @see MapProviderComponent
 * @see ModifiableSingleNumberComponent
 * @see PropertyComponent
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.alive.user.UserCharacter
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.PerkBranch
 * @see ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.Perk
 * @since 1.1.3
 */
public interface PerkBranchProgressionComponent extends MapProviderComponent<Long,
        ModifiableSingleNumberComponent.ModifiableSingleIntComponent>, PropertyComponent {
    /**
     * get current perk rank value if such perk is present is this branch.
     *
     * @param perkId - id of the perk to get rank of.
     * @return given perk's rank if such perk ID is present in this branch, -1 otherwise.
     */
    default @NotNull Integer getPerkRank(@NotNull Long perkId) {
        return containsKey(perkId) ? get(perkId).getValue() : -1;
    }

    /**
     * raise given perk's rank (happens when user invests Skill Point in given perk).
     *
     * @param perkId - ID of the perk to invest in.
     */
    default void raiseSkillRank(@NotNull Long perkId) {
        if (containsKey(perkId)) {
            get(perkId).increase(1);
        }
    }
}
