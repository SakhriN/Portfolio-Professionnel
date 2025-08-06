public class BorrowRecord {

    private final int itemId;
    private final String borrowerName;
    private final String borrowDate;


    public BorrowRecord(int itemId, String borrowerName, String borrowDate) {
        this.itemId = itemId;
        this.borrowerName = borrowerName;
        this.borrowDate = borrowDate;
    }

    @Override
    public String toString() {
        return "BorrowRecord : " + "\n" +
                "itemId= " + itemId + "\n" +
                ", borrowerName= " + borrowerName + "\n" +
                ", borrowDate='" + borrowDate + "\n" +
                ". \n ";
    }

}
