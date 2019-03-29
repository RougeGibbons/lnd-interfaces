package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers.requirements;

import org.jetbrains.annotations.NotNull;

/**
 * {@link RequirementComponent} interface extension representing various requirements to some parameter's value.
 *
 * @see RequirementComponent
 * @since 1.1.3
 */
public interface NumericalRequirementComponent extends RequirementComponent {
    /**
     * get required value.
     *
     * @return required value.
     */
    @NotNull Integer getRequiredValue();
}
