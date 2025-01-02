// Components of the Lambda Statement
// characters.sort((a, b) -> map.get(a) - map.get(b));  assending order

// These are the two elements being compared during the sorting process.
// In this case, a and b represent characters from the characters list.
// map.get(a) and map.get(b):

// The map.get(a) retrieves the value associated with the key a in the map. Similarly, map.get(b) retrieves the value for b.
// These values are typically the frequencies of the characters (if map is storing frequencies).
// map.get(a) - map.get(b):

// This performs subtraction of the frequency of a from the frequency of b.
// If the result is:
// 1. Positive: b should come before a in the sorted order.
// 2. Zero: a and b are equal in terms of frequency, so their relative order doesn't change.
// 3. Negative: a should come before b.
// Descending Order:

// By subtracting map.get(a) from map.get(b), we ensure that characters with higher frequencies (higher values in the map) are placed earlier in the list.



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

        // Sort based on map values in descending order
        characters.sort((a, b) -> map.get(a) - map.get(b));

        System.out.println(characters); // Output: [c,a,b]
    }
}
