package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;

    public Student() {
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for(Lab lab: labs) {
            if(lab.getName().equals(labName))
                return lab;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

    }

    public void forkLab(Lab lab) {

    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
