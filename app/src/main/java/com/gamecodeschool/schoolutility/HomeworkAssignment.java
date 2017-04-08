package com.gamecodeschool.schoolutility;

import android.provider.ContactsContract;
import android.support.annotation.StringDef;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by wdwoo on 3/15/2017.
 */

//TODO:Implement the rest of the variables which can be assigned to a homework assignment and make sure to implement them in all the necesary areas
public class HomeworkAssignment {

    //Member Variables//
    private String assignmentName;
    private String assignmentDescription;
    private String assignmentType;
    private String classType;
    private String dueDate;
    ////////////////////

    public HomeworkAssignment() {
        //empty constructor, necesary to have one which can have a JSON object fed
    }

    public HomeworkAssignment(String assignmentName, String assignmentDescription, String dueDate) {
        this.assignmentName = assignmentName;
        this.assignmentDescription = assignmentDescription;
        this.dueDate = dueDate;
    }



    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }

    public String getAssignmentType() {
        return assignmentType;
    }

    public void setAssignmentType(String assignmentType) {
        this.assignmentType = assignmentType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }


}
