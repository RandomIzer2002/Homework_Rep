import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class MyList<T> implements List<T> {

    private T[] elements;
    private int size;

    public MyList() {
        elements = (T[]) new Object[10];
        size = 0;
    }

    public boolean add(T e) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = e;
        return true;
    }

    public T remove(int index) {
        T removed = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return removed;
    }

    public T get(int index) {
        return elements[index];
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public T set(int index, T e) {
        T replaced = elements[index];
        elements[index] = e;
        return replaced;
    }

    public void add(int index, T e) {
        if (size == elements.length) {
            grow();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = e;
        size++;
    }

    public boolean addAll(Collection<? extends T> c) {
        for (T e : c) {
            add(e);
        }
        return true;
    }

    public void clear() {
        elements = (T[]) new Object[10];
        size = 0;
    }

    // other List methods are unimplemented

    private void grow() {
        T[] newElements = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public boolean contains(Object o) {
    throw new UnsupportedOperationException();
}

public Iterator<T> iterator() {
    throw new UnsupportedOperationException();
}

public boolean removeAll(Collection<?> c) {
    throw new UnsupportedOperationException();   
}

public boolean retainAll(Collection<?> c) {
    throw new UnsupportedOperationException();
}

public ListIterator<T> listIterator(int index) {
    throw new UnsupportedOperationException();
}

public ListIterator<T> listIterator() {
    throw new UnsupportedOperationException();
}

public <T> T[] toArray(T[] a) {
    throw new UnsupportedOperationException();
}

public Object[] toArray() {
    throw new UnsupportedOperationException();       
}

public boolean containsAll(Collection<?> c) {
    throw new UnsupportedOperationException();              
}

public int indexOf(Object o) {
    throw new UnsupportedOperationException();
}

public boolean isEmpty() {
    throw new UnsupportedOperationException();
}

public boolean addAll(int index, Collection<? extends T> c) {
    throw new UnsupportedOperationException();
}

public List<T> subList(int fromIndex, int toIndex) {
    throw new UnsupportedOperationException();
}

public boolean remove(Object o) {
    throw new UnsupportedOperationException();
}

public int lastIndexOf(Object o) {
    throw new UnsupportedOperationException();
}
}