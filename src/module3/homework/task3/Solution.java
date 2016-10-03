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

    Student student1 = new Student("Obama", coursesPackage3);
    Student student2 = new Student("Kevin", "Mitnick", 9);

    CollegeStudent student3 = new CollegeStudent("Jhordan", coursesPackage1);
    CollegeStudent student4 = new CollegeStudent("Jhon", "Jhonson", 6);
    CollegeStudent student5 = new CollegeStudent("KumarMagic", "Jim", 10, "Standard College", 85, 12345);

    SpecialStudent studen6 = new SpecialStudent("Lee", coursesPackage3);
    SpecialStudent student7 = new SpecialStudent("William", "Shakespeare", 9, "Cool College", 100, 7);
    SpecialStudent student8 = new SpecialStudent("Newton", coursesPackage2, 123213210);

}
