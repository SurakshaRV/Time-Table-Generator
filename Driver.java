package com.example.timetablegen;

import android.os.Build;

import androidx.annotation.RequiresApi;

public class Driver {
    public static final int POPULATION_SIZE=9;
    public static final double MUTATION_RATE=0.1;
    public static final double CROSSOVER_RATE=0.9;
    public static final int TOURNAMENT_SELECTION_SIZE=3;
    public static final int NUMB_OF_ELITE_SCHEDULES=1;
    private Data data;
    public static void main(String[] args){
        Driver driver=new Driver();
        driver.data=new Data();

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void printAvailableData(){
        System.out.println("Avaialable Departments -> ");
        data.getDepts().forEach(x->System.out.println("name: "+x.getName()+", courses: "+x.getCourses()));
        System.out.println("\nAvailable Courses ->");
        data.getCourses().forEach(x->System.out.println("course #: "x.getNumber()+", name: "+x.getName()+", max # of students: "+x.getMaxNumberOfStudents()+", instructors: "+x.getInstructors()));
        System.out.println("\nAvailable Rooms ->");
        data.getRooms().forEach(x->System.out.println("room #: "+x.getNumber()+", max seating capacity: "+x.getSeatingCapacity()));
        System.out.println("\nAvaialable Instructors ->  ");
        data.getInstructors().forEach(x->System.out.println("id: "+x.getId()+", name: "+x.getName()));
        System.out.println("\nAvaialable Meeting Times ->  ");
        data.getMeetingTimes().forEach(x->System.out.println("id: "+x.getId()+", meeting Time: "+x.getTime()));
        System.out.println("-------------------------------------------------------------------------------");
    }

}
