package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.requirements;

import org.jetbrains.annotations.NotNull;

/**
 * {@link RequirementComponent} interface extension for components representing
 * various ID-matching requirement checks (race, class, weapon/armor kind, etc.).
 *
 * @see RequirementComponent
 * @since 1.1.3
 */
public interface IdMatchingRequirementComponent extends RequirementComponent {
    /**
     * get ID to match context with.
     *
     * @return ID to match with.
     */
    @NotNull Long getRequiredId();
}
