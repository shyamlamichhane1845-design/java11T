class Constructor{

    int bookId;
    String title;
    String author;


     Constructor(int  bookId , String title , String author){
      this.bookId = bookId;
      this.title = title;
      this.author = author;


     }

void displayInformation(){

 System.out.println("bookId" + bookId);
 System.out.println("title" + title);
 System.out.println("author" + author);
 


}
}

    public class ConstructorQuestion{
     public static void main(String[] args) {
    Constructor obj = new Constructor(1,"lord","shyam");
    obj.displayInformation();
     } 
}




