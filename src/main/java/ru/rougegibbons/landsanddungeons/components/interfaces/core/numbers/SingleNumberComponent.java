package ru.rougegibbons.landsanddungeons.components.interfaces.core.numbers;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins.PackableComponent;

/**
 * Generic interface for components containing single number.
 *
 * @param <T> - any {@link Number} class derivatives.
 *
 * @see Number
 * @since 0.3.5
 */
public interface SingleNumberComponent<T extends Number> extends PackableComponent {
    /**
     * get stored value.
     *
     * @return stored value
     */
    @NotNull T getValue();

    /**
     * {@link SingleNumberComponent} extension for {@link Integer} numbers.
     *
     * @since 0.3.5
     */
    interface SingleIntComponent extends SingleNumberComponent<Integer> {

    }

    /**
     * {@link SingleNumberComponent} extension for {@link Long} numbers.
     *
     * @since 0.3.5
     */
    interface SingleLongComponent extends SingleNumberComponent<Long> {

    }

    /**
     * {@link SingleNumberComponent} extension for {@link Float} numbers.
     *
     * @since 0.3.5
     */
    interface SingleFloatComponent extends SingleNumberComponent<Float> {

    }
}
