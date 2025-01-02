// characters.sort((a, b) -> map.get(a) - map.get(b));
// Positive (map.get(a) - map.get(b) > 0):

// If map.get(a) is greater than map.get(b), the result is positive.
// This means a should come after b in the sorted order.
// Negative (map.get(a) - map.get(b) < 0):

// If map.get(a) is less than map.get(b), the result is negative.
// This means a should come before b in the sorted order.
// Zero (map.get(a) - map.get(b) == 0):

// If map.get(a) is equal to map.get(b), the result is zero.
// This means a and b are equal in terms of value, and their relative order doesn’t change.
// In short:

// Positive: a comes after b.
// Negative: a comes before b.
// Zero: No change in order (they are equal).


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample map
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 3);
        map.put('b', 5);
        map.put('c', 1);

        // List of characters to sort
        List<Character> characters = new ArrayList<>(map.keySet());

        // Sort based on map values in asscending order
        characters.sort((a, b) -> map.get(a) - map.get(b));

        System.out.println(characters); // Output: [c,a,b]
    }
}
