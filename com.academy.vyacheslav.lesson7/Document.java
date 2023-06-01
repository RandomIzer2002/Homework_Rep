public class Document implements Printable, Cloneable, Comparable<Document> {

    private String name;
    private int pageCount;

    public Document() {}

    public Document(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }
    
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return new Document(this.name, this.pageCount);
    }

    @Override
    public int compareTo(Document document) {
        return Integer.compare(this.pageCount, document.pageCount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (pageCount != document.pageCount) return false;
        return name != null ? name.equals(document.name) : document.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + pageCount;
        return result;
    }
}
