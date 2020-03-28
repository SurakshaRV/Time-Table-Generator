package com.example.timetablegen;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    private ArrayList<Room> rooms;
    private ArrayList<Instructor> instructors;
    private ArrayList<Course> courses;
    private ArrayList<Department> depts;
    private ArrayList<MeetingTime> meetingTimes;
private int numberOfClasses=0;
@RequiresApi(api = Build.VERSION_CODES.N)
public  Data(){ initialize();}

    @RequiresApi(api = Build.VERSION_CODES.N)
    private Data initialize() {
    Room room1=new Room("R1",25);
        Room room2=new Room("R2",45);
        Room room3=new Room("R3",35);
        rooms=new ArrayList<Room>(Arrays.asList(room1,room2,room3));
        MeetingTime mt1=new MeetingTime("MT1","MWF 09:00 - 10:00");
        MeetingTime mt2=new MeetingTime("MT2","MWF 10:00 - 11:00");
        MeetingTime mt3=new MeetingTime("MT3","MWF 09:00 - 10:30");
        MeetingTime mt4=new MeetingTime("MT4","MWF 10:30 - 12:00");
        meetingTimes=new ArrayList<MeetingTime>(Arrays.asList(mt1,mt2,mt3,mt4));
        Instructor i1=new Instructor("I1","Dr. James");
        Instructor i2=new Instructor("I2","Dr. Mike");
        Instructor i3=new Instructor("I3","Dr. Steve");
        Instructor i4=new Instructor("I4","Dr. Jane");
        instructors=new ArrayList<Instructor>(Arrays.asList(i1,i2,i3,i4));
        Course c1=new Course("C1","MAD", new ArrayList<Instructor>(Arrays.asList(i1,i2)),25);
        Course c2=new Course("C2","SPMF", new ArrayList<Instructor>(Arrays.asList(i1,i2,i3)),35);
        Course c3=new Course("C3","OOMD", new ArrayList<Instructor>(Arrays.asList(i1,i2)),30);
        Course c4=new Course("C4","AI", new ArrayList<Instructor>(Arrays.asList(i3,i4)),35);
        Course c5=new Course("C5","NN", new ArrayList<Instructor>(Arrays.asList(i4)),45);
        Course c6=new Course("C6","TFCS", new ArrayList<Instructor>(Arrays.asList(i1,i3)),45);
        courses=new ArrayList<Course>(Arrays.asList(c1,c2,c3,c4,c5,c6));
        Department d1=new Department("CSE",new ArrayList<Course>(Arrays.asList(c1,c3,c6)));
        Department d2=new Department("ISE",new ArrayList<Course>(Arrays.asList(c2,c4,c5)));
        depts=new ArrayList<Department>(Arrays.asList(d1,d2));
        depts.forEach(x-> numberOfClasses+=x.getCourses().size());
        return this;
    }
public ArrayList<Room> getRooms(){ return rooms;}
    public ArrayList<Instructor> getInstructors(){ return instructors;}
    public ArrayList<Course> getCourses(){ return courses;}
    public ArrayList<Department> getDepts(){ return depts;}
    public ArrayList<MeetingTime> getMeetingTimes(){ return meetingTimes;}
public int getNumberOfClasses(){ return this.numberOfClasses;}
}
