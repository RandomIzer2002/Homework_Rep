public class GenericArray<T> {
    private T typeArr[];

    public GenericArray(T[] typeArr) {
        this.typeArr = typeArr;
    }

    public void setElement(T[] typeArr){
        this.typeArr = typeArr;
    }

    public T getElement(int index){
        if(index >= 0 && index < typeArr.length){
            return typeArr[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index:" + index);
        }
    }
}
