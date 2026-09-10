class Employee {
    int id;
    String name;
    double salary;

 Employee(int id , String name , double salary){

   this.id = id;
   this.name = name;
   this.salary = salary;



 }
 void  displayEmployee(){
 System.out.println("id " + id);
System.out.println("name " + name);
System.out.println("salary " + salary);




 }
}
   public class Employee1{
   public static void main(String[] args) {
    Employee obj = new Employee(1, "shyam", 120000);
   obj.displayEmployee();
   }
  }
    
 
