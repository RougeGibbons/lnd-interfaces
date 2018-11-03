package ru.rougegibbons.landsanddungeons.components.interfaces.core.mixins;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.affectors.generic.AffectorComponent;

import java.util.List;

public interface MultipleAffectorsSpawningComponent {
    @NotNull List<AffectorComponent> spawn();
}
