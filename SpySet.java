import java.util.*;

/* 
 * SpySet<E> should be a child class of HashSet<E>.
 * SpySet keeps track of the number of times we attempt
 * to add a duplicate value. If we attempt to add a 
 * duplicate value N times, remove all elements from 
 * the SpySet.
 * 
 * The value of N should be obtained as an argument to
 * the constructor.  
 * 
 * Note the type of the SpySet, and the HashSet it 
 * extends, is E. This is what is called a generic type,
 * and can be thought of as a stand-in for any object
 * type in Java. 
 * 
 * For example, if we create a SpySet of Strings, then
 * in the code below, every occurrence of E would refer to
 * a String. 
 */


public class SpySet<E> extends HashSet<E>
{
    /*
     * Declare instance variables as needed. They should be private.
     */ 
    

    
    /* 
     * Write a constructor for SpySet that has an int parameter.
     * The argument passed into the SpySet constructor is the
     * number of times we can attempt to add a duplicate before
     * the SpySet is cleared.
     */
    private int duplicateCount;
    private final int duplicateLimit;

    public SpySet(int N) {
        this.duplicateLimit = N;
        this.duplicateCount = 0;
    }

    @Override 
    public boolean add(E elem) {
        if (contains(elem)) {
            duplicateCount++;
            if (duplicateCount >= duplicateLimit) {
                clear();
            }
            return false;
        }
        return super.add(elem);
    }

    @Override 
    public void clear() {
        super.clear();
        duplicateCount = 0;
    }

    public int getDuplicateCount() {
        return duplicateCount;
    }

    public int getDuplicateLimit() {
        return duplicateLimit;
    }
}