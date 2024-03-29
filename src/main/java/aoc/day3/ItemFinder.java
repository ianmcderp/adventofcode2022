package aoc.day3;

public class ItemFinder {
    public static char findInRucksack(Rucksack rucksack) {
        // split content in to compartments
        String rawContent = rucksack.getRawContent();
        String firstCompartment = rawContent.substring(0, rawContent.length() / 2);
        String secondCompartment = rawContent.substring(rawContent.length() / 2);

        // find common character
        char commonCharacter = Character.UNASSIGNED;
        for (char fc : firstCompartment.toCharArray()) {
            if (secondCompartment.indexOf(fc) > -1) {
                commonCharacter = fc;
                break;
            }
        }

        return commonCharacter;
    }

    public static char findInRucksacks(Rucksack first, Rucksack second, Rucksack third) {
        char commonCharacter = Character.UNASSIGNED;
        for (char fc : first.getRawContent().toCharArray()) {
            if (second.getRawContent().indexOf(fc) > -1 && third.getRawContent().indexOf(fc) > -1) {
                commonCharacter = fc;
                break;
            }
        }
        return commonCharacter;
    }
}
