package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.requirements;

import org.jetbrains.annotations.NotNull;

/**
 * {@link NumericalRequirementComponent} interface extension representing perk requirements
 * to be fulfilled before unlocking that perk.
 *
 * @see NumericalRequirementComponent
 * @since 1.1.3
 */
public interface PerkRequirementComponent extends NumericalRequirementComponent {
    /**
     * get required perk id.
     *
     * @return id of the perk required.
     */
    @NotNull Long getPerkId();
}
