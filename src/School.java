

import java.util.ArrayList;

public class School {

    //CanLearn happens to be the only type that each of our beings has :/
    ArrayList<CanLearn> Students = new ArrayList<>();
    //What if you'd like to create an environment where learning is not necessary?

    String placeName = "Default Place Name";

    public School(String n){
        placeName = n;
    }

    public void enrollStudent(CanLearn student){
        Students.add(student);
    }

    public void dropStudent(CanLearn student){
        Students.remove(student);
    }

    public void teach(){
        for(CanLearn student: Students){
            student.learn();
        }
    }

    public void rollCall(){
        for(CanLearn student: Students){
            //Uh Oh, getName is not an attribute of CanLearn, should it be so that this could work?
            System.out.println(student.getName());
        }
    }

}
