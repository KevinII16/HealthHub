package WellnessGoals;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevinalabi
 */

public class Goal {

    private String goalName;
    private String dailyTarget;
    private String deadline;

    public Goal(String goalName, String dailyTarget, String deadline) {
        this.goalName = goalName;
        this.dailyTarget = dailyTarget;
        this.deadline = deadline;
    }

    public String getGoalName() {
        return goalName;
    }

    public String getDailyTarget() {
        return dailyTarget;
    }

    public String getDeadline() {
        return deadline;
    }
}