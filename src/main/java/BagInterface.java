public interface BagInterface <T>{
    int size();
    boolean isEmpty();
    boolean add(T newEntry);
    T get(int index);
    T remove();
    boolean remove(T anEntry);
    boolean remove(int index);
    void clear();
    int getFrequencyOf(T anEntry);
    boolean contains(T anEntry);
    @Override
    String toString();
}
