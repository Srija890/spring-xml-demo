package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanFactoryAware, BeanNameAware, ApplicationContextAware
{
    private Actor actor;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        System.out.println("Implementing BeanFactoryAware");
    }

    @Override
    public void setBeanName(String s)
    {
        System.out.println("Implementing BeanNameAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println("Implementing ApplicationContext");
    }

    public Movie(Actor actor)
    {
        this.actor = actor;
    }
    public Movie()
    {

    }
    public void setActor(Actor actor)
    {
        this.actor = actor;

    }

    public void display()
    {
        System.out.println("The actor information : " +actor.getName()+"  "+actor.getGender() +"   "+actor.getAge());
    }
}



