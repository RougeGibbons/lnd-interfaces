package ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.triggers;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.behavioral.BehaviorComponent;

public interface TriggerComponent extends BehaviorComponent {
    @NotNull Boolean isTripped();
}
