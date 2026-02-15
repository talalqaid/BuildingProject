public interface BagInterface <T>{
    int size();
    boolean isEmpty();
    boolean add(T newEntry);
    T remove();
    boolean remove(T anEntry);
    void clear();
    int getFrequencyOf(T anEntry);
    boolean contains(T anEntry);
    @Override
    String toString();
}
