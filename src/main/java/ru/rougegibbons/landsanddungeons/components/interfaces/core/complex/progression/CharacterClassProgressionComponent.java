package ru.rougegibbons.landsanddungeons.components.interfaces.core.complex.progression;

import org.jetbrains.annotations.NotNull;
import ru.rougegibbons.landsanddungeons.components.interfaces.core.properties.UpdateablePropertyComponent;
import ru.rougegibbons.landsanddungeons.entities.interfaces.gamemechanics.flyweights.classes.CharacterClass;

/**
 * {@link UpdateablePropertyComponent} representing container for {@link CharacterClass},
 * storing character's progression and current state of abilities.
 *
 * @see UpdateablePropertyComponent
 * @see CharacterClass
 * @see CharacterClassProgressionComponent
 * @see PerkTreeProgressionComponent
 * @see SkillsetComponent
 * @since 1.1.3
 */
public interface CharacterClassProgressionComponent
        extends UpdateablePropertyComponent {
    /**
     * get {@link CharacterClass} instance stored in this component.
     *
     * @return {@link CharacterClass} instance stored.
     */
    @NotNull CharacterClass getCharacterClass();

    /**
     * get character level in given class.
     *
     * @return character level in stored {@link CharacterClass} as {@link Integer}.
     */
    @NotNull Integer getClassLevel();

    /**
     * increase this class' level, unlock new abilities and get some skill points.
     */
    void levelUp();

    /**
     * get skill points available for given class.
     *
     * @return available skill point number.
     */
    @NotNull Integer getSkillPoints();

    /**
     * get character's progression in given class' perk tree.
     *
     * @return character's progression in given {@link CharacterClass} perk tree as {@link PerkTreeProgressionComponent}.
     */
    @NotNull PerkTreeProgressionComponent getPerkBranchesProgression();

    /**
     * get character's progression in given class' skillset.
     *
     * @return {@link SkillsetComponent} storing data about abilities' levels, mastery levels, availability, etc.
     */
    @NotNull SkillsetComponent getSkillset();
}
