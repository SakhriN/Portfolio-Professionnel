public class Magazine extends LibraryItem {

    private int IssueNumber;


    public Magazine(int id, String title, int publicationYear, int issueNumber) {
        super(id, title, publicationYear);
        this.IssueNumber = issueNumber;
    }




    @Override
    public String toString() {
        return "Magazine : \n" +
                "title = " + getTitle() +
                ", publicationYear = " + getPublicationYear() +
                "IssueNumber = " + IssueNumber +
                ". ";
    }
}
