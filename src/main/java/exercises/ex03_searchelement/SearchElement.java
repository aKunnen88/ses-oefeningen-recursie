package exercises.ex03_searchelement;

import java.util.List;

public class SearchElement {

    public static <T> int search(
            List<? extends T> elements,
            T elementToFind) {

        if (elements.isEmpty()) {
            return -1;
        }
        var last = elements.getLast();
        if (last.equals(elementToFind)){
            return elements.size() - 1;
        } else {
            return search(elements.subList(0, elements.size() - 1), elementToFind);
        }
    }
}
