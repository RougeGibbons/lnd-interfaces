package ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers;

import org.jetbrains.annotations.NotNull;

/**
 * extension of {@link SingleNumberComponent} allowing to modify the value stored in component.
 *
 * @param <T> - any extension of {@link Number} class.
 * @see SingleNumberComponent
 * @see Number
 * @since 0.3.3
 */
public interface ModifiableSingleNumberComponent<T extends Number>
        extends SingleNumberComponent<T> {
    /**
     * assigns the passed value to the stored value.
     *
     * @param value - value to assign
     */
    void setValue(@NotNull T value);

    /**
     * adds the given amount to the current stored value.
     *
     * @param amount - value to add.
     */
    void increase(@NotNull T amount);

    /**
     * subtracts the given amount from the current stored value.
     *
     * @param amount - value to subtract.
     */
    void decrease(@NotNull T amount);

    /**
     * modifies current value by given percentage.
     *
     * @param percent - float percentage value to modify the stored one by.
     */
    void modifyByPercentage(@NotNull Float percent);

    /**
     * modifies current value by given percentage.
     *
     * @param percent - integer percentage value to modify the stored one by.
     */
    void modifyByPercentage(@NotNull Integer percent);

    /**
     * {@link ModifiableSingleNumberComponent} extension for {@link Integer} numbers.
     *
     * @since 0.3.3
     */
    interface ModifiableSingleIntComponent extends ModifiableSingleNumberComponent<Integer> {

    }

    /**
     * {@link ModifiableSingleNumberComponent} extenison for {@link Long} numbers.
     *
     * @since 0.3.3
     */
    interface ModifiableSingleLongComponent extends ModifiableSingleNumberComponent<Long> {

    }

    /**
     * {@link ModifiableSingleNumberComponent} extension for {@link Float} numbers.
     *
     * @since 0.3.3
     */
    interface ModifiableSingleFloatComponent extends ModifiableSingleNumberComponent<Float> {

    }
}
