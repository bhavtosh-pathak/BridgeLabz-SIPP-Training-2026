import java.util.ArrayList;
import java.util.List;


abstract class CourseType {

    String courseName;

    CourseType(String name){
        courseName=name;
    }
}


class ExamCourse extends CourseType{

    ExamCourse(String name){
        super(name);
    }
}


class AssignmentCourse extends CourseType{

    AssignmentCourse(String name){
        super(name);
    }
}


class ResearchCourse extends CourseType{

    ResearchCourse(String name){
        super(name);
    }
}




class Course<T extends CourseType>{


    ArrayList<T> courses=new ArrayList<>();


    void addCourse(T course){

        courses.add(course);

    }


    List<T> getCourses(){

        return courses;

    }

}



public class UniversityCourseManagementSystem {


    static void displayCourses(
            List<? extends CourseType> courses){


        for(CourseType c:courses){

            System.out.println(c.courseName);

        }

    }



    public static void main(String[] args){


        Course<ExamCourse> exam =
                new Course<>();

        exam.addCourse(
                new ExamCourse("Data Structures"));



        Course<ResearchCourse> research =
                new Course<>();

        research.addCourse(
                new ResearchCourse("AI Research"));



        displayCourses(exam.getCourses());

        displayCourses(research.getCourses());

    }
}