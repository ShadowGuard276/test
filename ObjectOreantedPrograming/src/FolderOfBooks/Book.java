package FolderOfBooks;

public class Book {
	private int noOfCopies;
	void setnoOfCopies(int noOfCopies) {
		if(noOfCopies>0)
		this.noOfCopies= noOfCopies;		
	}
	int getnoOfCopies() {
		return this.noOfCopies;
	}
	void increaseNoOfCopys(int howmany) {
		setnoOfCopies(this.noOfCopies+howmany);
	}
	void decreaseNoOfCopys( int howmany) {
		setnoOfCopies(this.noOfCopies-howmany);
	}
void openBook() {
	System.out.println("book opened");
}
void pageno() {
	System.out.println("page no 151");
}
void closebook() {
	System.out.println("book closed");
}
}
