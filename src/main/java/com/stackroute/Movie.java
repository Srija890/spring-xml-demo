package com.stackroute;

public class Movie
{
    private String m_name;
    Actor actor; //creating object

    public  Movie(String m_name,Actor actor)
    {
        this.m_name=m_name;
        this.actor=actor;
    }
    public  Movie()
    {

    }
    //setter and getter methods
    public  Actor getActor(){
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "m_name='" + m_name + '\'' +
                ", actor=" + actor +
                '}';

   /* public  void display(){
        System.out.println(""+actor.getName() +""+actor.getGender() +""+actor.getAge());
    }
*/
    }
}
