package module3.homework.task3;


import java.util.Date;

public class Solution {

    Date date = new Date();

    Course english = new Course(date, "English");
    Course javaCore = new Course(date, "JavaCore");
    Course softSkills = new Course(date, "SoftSkills");
    Course french = new Course("French", 40, "Jhan Pierre");
    Course guitar = new Course("Plying guitar in 24 lessons", 48, "Ewan Dobson");

    Course[] coursesPackage1 = {english, javaCore, softSkills};
    Course[] coursesPackage2 = {english, javaCore, softSkills, french};
    Course[] coursesPackage3 = {english, javaCore, softSkills, french, guitar};

    CollegeStudent student1 = new CollegeStudent("Jhordan", coursesPackage1);
    CollegeStudent student2 = new CollegeStudent("Jhon", "Jhonson", 6);
    CollegeStudent student3 = new CollegeStudent("KumarMagic", 100, 777);
    CollegeStudent student4 = new CollegeStudent();

    Student student5 = new Student("Obama", coursesPackage3);
    Student student6 = new Student("Kevin", "Mitnick", 9);
    Student student7 = new Student();

    SpecialStudent student8 = new SpecialStudent("William", "Shakespeare", 9, 123456780);
    SpecialStudent student9 = new SpecialStudent("Newton", coursesPackage2, 123213210);
    SpecialStudent student10 = new SpecialStudent(1231231230);

}
