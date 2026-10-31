package org.example;

public class Teacher implements Workable, Teachable
{
    private String name;
    private int experience;
    private String subject;
    private int students;

    public Teacher(String name, int experience, String subject, int students)
    {
        this.name = name;
        this.experience = experience;
        this.subject = subject;
        this.students = students;
    }
    @Override
    public void work()
    {
        System.out.println(name + " преподает " + subject);
    }
    @Override
    public int getExperience()
    {
        return experience;
    }
    @Override
    public void teach()
    {
        System.out.println(name + " ведет уроки по предмету " + subject);
    }
    @Override
    public int getStudents()
    {
        return students;
    }
}
