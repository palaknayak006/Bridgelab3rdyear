class EBook extends BookWithAccess {
     double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayDetails() {
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title +
                ", Author: " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}
