public class Studentimp{
    public static void main(String[] args){
        Student s=new Student("anjali","7125");
        s.display();
    }
} 
 class Student{
    String nam,rn;
    Student(String name,String rno){
        nam=name;
        rn=rno;
    }
    public void display(){
        System.out.printf("welcome %s rno is %s \n",nam,rn);
    }
}