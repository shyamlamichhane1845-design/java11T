class ConstructorQuestion {

    int bookId;
    String title;
    String author;


     ConstructorQuestion(int  bookId , String title , String author){
      this.bookId = bookId;
      this.title = title;
      this.author = author;


     }

void displayInformation(){

 System.out.println("bookId" + bookId);
 System.out.println("title" + title);
 System.out.println("author" + author);
 


}

public class ConstructorQuestionM{
     public static void main (String[] args) {

    ConstructorQuestion obj = new ConstructorQuestion(1,"lord","shyam");
    obj.displayInformation();



}
    





}










}




