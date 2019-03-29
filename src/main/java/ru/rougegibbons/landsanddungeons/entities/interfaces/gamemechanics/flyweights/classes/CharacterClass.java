package ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.GameEntityStorageComponent;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.items.SlotsKindsProviderComponents;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression.PerkTreeComponent;

/**
 * {@link AliveEntityRole} interface extension representing various character classes.
 *
 * @see AliveEntityRole
 * @see SlotsKindsProviderComponents
 * @see PerkTreeComponent
 * @see PerkBranch
 * @see Perk
 * @since 1.1.3
 */
public interface CharacterClass extends AliveEntityRole {
    /**
     * get item kinds available for this character class.
     *
     * @return {@link SlotsKindsProviderComponents} instance storing item kinds available for this character class.
     */
    @NotNull SlotsKindsProviderComponents getAvailableItemKinds();

    /**
     * get this class' perk tree.
     *
     * @return {@link PerkTreeComponent} instance storing this class' perk tree.
     */
    @NotNull PerkTreeComponent getPerkTree();

    /**
     * get class' {@link PerkBranch} by its ID.
     *
     * @param branchId - ID of the {@link PerkBranch} to get.
     * @return requested {@link PerkBranch} instance if such id is present in class' perk tree, null otherwise.
     */
    default @Nullable PerkBranch getPerkBranch(@NotNull Long branchId) {
        final GameEntityStorageComponent.PerkBranchSlot slot =
                getPerkTree().getOrDefault(branchId, null);
        return slot == null ? null : slot.getStored();
    }

    /**
     * get {@link Perk} from given {@link PerkBranch} by given branch and perk ids.
     *
     * @param branchId - id of {@link PerkBranch} to get {@link Perk} from.
     * @param perkId   - id of the {@link Perk} to get.
     * @return requested {@link Perk} instance or null if at least one of the given ids is invalid.
     */
    default @Nullable Perk getPerk(@NotNull Long branchId,
                                   @NotNull Long perkId) {
        final PerkBranch branch = getPerkBranch(branchId);
        if (branch == null) {
            return null;
        }
        final GameEntityStorageComponent.PerkSlot slot =
                branch.getPerks().getOrDefault(perkId, null);
        return slot == null ? null : slot.getStored();
    }
}
