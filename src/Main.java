import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main extends IOException {
    public static class Student{
        int age;
        String name;

        public Student(String name, int age) {
            setName(name);
            setAge(age);
        }

        public String getName() {
            return this.name;
        }
        public void setName(String name){
            this.name=name;
        }

        public int getAge(){
            return this.age;
        }
        public void setAge(int age){
            this.age=age;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student>studentList=new ArrayList<>();
        Student ZHL=new Student("ZHL",21);
        studentList.add(ZHL);
        Student ZCY=new Student("ZCY",21);
        studentList.add(ZCY);

        Iterator<Student>it=studentList.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
        StringBuffer s=new StringBuffer("123");
        s.append("hahaha");
        System.out.println(s);

    }
}
