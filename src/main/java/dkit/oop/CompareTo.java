package dkit.oop;

import java.util.Comparator;

public class CompareTo implements Comparator<Airplane>{



    // implement the compare() method required by the Comparator interface
    public int compare(Airplane a1, Airplane a2)
    {
        return a1.getType().compareTo(a2.getType());

        // The Make of a car is of type String and the String class implements
        // a compareTo() method that returns -1, 0, or +1 as appropriate.
        // So, to compare string fields we simply use the compareTo() method
    }
}
