import java.util.Arrays;

public class DZ7Task1 {
    public static void main(String[] args) {
        Document[] documents = new Document[]{
                new Document("Документ 1", 10),
                new Document("Документ 2", 5),
                new Document("Документ 3", 7)
        };

        Arrays.sort(documents);

        for (Document document : documents) {
            System.out.println(document.getName() + " - страниц: " + document.getPageCount());
        }

        Document clone = null;
        try {
            clone = documents[0].clone();
        } catch (CloneNotSupportedException err) {
            err.printStackTrace();
        }

        System.out.println("Documents[0] == clone? " + (documents[0] == clone));
        System.out.println("Documents[0].equals(clone)? " + (documents[0].equals(clone)));
        System.out.println("clone.equals(new Document(\"Test\", 10))? " + (clone.equals(new Document("Test", 10))));

        Object obj = clone;
        Printable printable = (Printable) obj;
        printable.print();
    }
}