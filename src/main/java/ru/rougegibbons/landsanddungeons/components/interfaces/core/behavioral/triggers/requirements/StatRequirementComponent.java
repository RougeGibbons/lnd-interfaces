package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.requirements;

import org.jetbrains.annotations.NotNull;

/**
 * {@link NumericalRequirementComponent} interface extension representing requirements made to character stats.
 *
 * @see NumericalRequirementComponent
 * @since 1.1.3
 */
public interface StatRequirementComponent extends NumericalRequirementComponent {
    /**
     * get required stat id.
     *
     * @return required stat id.
     */
    @NotNull Long getStatId();
}
