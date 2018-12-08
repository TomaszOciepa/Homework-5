package model;

public class Student {

    private String name;
    private String surname;
    private String teamName;

    public Student(String name, String surname, String teamName) {
        this.name = name;
        this.surname = surname;
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
