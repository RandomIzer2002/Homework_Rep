interface Printable {
    String getName();

    default void print(){
        System.out.println("Документ " + getName() + " был отправлен на печать.");
    }
}