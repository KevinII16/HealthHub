/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WellnessGoals;

/**
 *
 * @author kevinalabi
 */
public class Habit {
    private String habitName;
    private String date;
    private String duration;
    private String notes;
    
    public Habit(String habitName, String date, String duration, String notes) {
        this.habitName = habitName;
        this.date = date;
        this.duration = duration;
        this.notes = notes;
    }

    public String getHabitName() {
        return habitName;
    }

    public String getDate() {
        return date;
    }

    public String getDuration() {
        return duration;
    }

    public String getNotes() {
        return notes;
    }
}

    
