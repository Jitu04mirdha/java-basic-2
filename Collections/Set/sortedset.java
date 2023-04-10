package python.Collections.Set;

import org.jetbrains.annotations
        .NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class sortedset {
    public static void main(String[] args) {
        SortedSet<String> ss=new SortedSet<String>() {
            @Nullable
            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @NotNull
            @Override
            public SortedSet<String> subSet(String fromElement, String toElement) {
                return null;
            }

            @NotNull
            @Override
            public SortedSet<String> headSet(String toElement) {
                return null;
            }

            @NotNull
            @Override
            public SortedSet<String> tailSet(String fromElement) {
                return null;
            }

            @Override
            public String first() {
                return null;
            }

            @Override
            public String last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public <T> T[] toArray(@NotNull T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        SortedSet<Integer> si=new TreeSet<>();
        si.add(34);
        si.add(21);
        si.add(20);
        si.add(90);
        si.add(2);

        System.out.println( si.contains(90));
        System.out.println(si);
        System.out.println(si.first());
        System.out.println(si.last());
        si.remove(90);
        System.out.println(si);
        for (Integer i:si) System.out.println(i);
    }
}
