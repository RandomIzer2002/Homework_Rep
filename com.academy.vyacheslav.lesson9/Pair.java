public class Pair<T> {
    private T anyFirst;
    private T anySecond;

    public Pair(T anyFirst, T anySecond){
        this.anyFirst = anyFirst;
        this.anySecond = anySecond;
    }

    public T first(){
        return anyFirst;
    }

    public T second(){
        return anySecond;
    }

    public void swap(){
        T temp = anyFirst;
        anyFirst = anySecond;
        anySecond = temp;
    }

    public void replaceFirst(T newFirst){
        anyFirst = newFirst;
    }

    public void replaceLast(T newSecond){
        anySecond = newSecond;
    }
}
