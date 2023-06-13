package com.oops.ThisKeyword;

class Student{
    int roll_no;
    String name;
    float fee;

    void studentDetails( int roll_no,String name,float fee){
       this.roll_no =roll_no;
       this.name = name;
       this.fee =fee;
        System.out.println(roll_no+" "+ name+" "+ fee);
    }
    void display(){
        studentDetails(103, "shivansh", 500);
    }

}

public class college {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentDetails(101,"Rohit",600);
          student.display();

    }
}
