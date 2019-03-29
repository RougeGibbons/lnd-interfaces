package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.PropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.core.mixins.Levelable;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.CharacterClass;

import java.util.Objects;

/**
 * {@link PropertyComponent} interface extension with {@link Levelable} mixin
 * representing container for character's total level progression.
 *
 * @see PropertyComponent
 * @see Levelable
 * @see CharacterProgressionComponent
 * @see CharacterClassProgressionComponent
 * @see CharacterClass
 * @since 1.1.3
 */
public interface CharacterProgressionComponent extends PropertyComponent, Levelable {
    /**
     * get character's progression in all classes taken.
     *
     * @return {@link CharacterClassesHolderComponent} instance containing
     */
    @NotNull CharacterClassesHolderComponent getClassesProgression();

    /**
     * check if this character is multiclassed (has more than one {@link CharacterClass} taken).
     *
     * @return true if the character has more than one taken class, false otherwise.
     */
    default @NotNull Boolean isMulticlassed() {
        return getClassesProgression().size() > 1;
    }

    /**
     * get character's progression in given {@link CharacterClass} by this class' id.
     *
     * @param classId - id of the {@link CharacterClass} requested.
     * @return {@link CharacterClassProgressionComponent} instance storing character's progression in {@link CharacterClass} requested.
     */
    default @Nullable CharacterClassProgressionComponent getClassProgression(
            @NotNull Long classId) {
        return getClassesProgression().getOrDefault(classId, null);
    }

    /**
     * add new {@link CharacterClass} to current classes set.
     *
     * @param toTake - {@link CharacterClass} to add.
     */
    void takeClass(@NotNull CharacterClass toTake);

    /**
     * get character's total level. Total level is sum of levels in all classes taken by this character plus unspent level up points.
     *
     * @return character's total level.
     */
    @Override
    default @NotNull Integer getLevel() {
        Integer level = 0;

        for (Long classId : getClassesProgression().keySet()) {
            level += Objects.requireNonNull(getClassProgression(classId)).getClassLevel();
        }

        return level + getLevelUpPoints();
    }

    /**
     * get level up points available
     * (level up point is point given each time as character receives new total level.
     * Level up points can be spend to increase character's level in given class.
     * See above for character's total level characterization).
     *
     * @return number of not spent level up points.
     */
    @NotNull Integer getLevelUpPoints();

    /**
     * increase character's level in given class.
     *
     * @param classId - id of the class to increase character's level in.
     */
    void levelUp(@NotNull Long classId);

    /**
     * get all abilities available to this character.
     *
     * @return {@link SkillsetComponent} component storing all abilities from all classes taken by this character.
     */
    @NotNull SkillsetComponent getAbilities();
}
