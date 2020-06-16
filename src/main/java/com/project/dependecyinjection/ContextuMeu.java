package com.project.dependecyinjection;

import com.project.dixml.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ContextuMeu {

    private Map<String, Object> contextBeans = new HashMap<>();

    public Object getBean(String name, Class c) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        if (!contextBeans.containsKey(name)){
            Constructor constructor = c.getConstructor(String.class);

            Object obj = constructor.newInstance(name);
            // Object obj = new Car(name);

            //todo stuff
            // 4999998 lines to go
            contextBeans.put(name, obj);
        }

        return contextBeans.get(name);
    }

    public Map<String, Object> getContextBeans(){
        return contextBeans;
    }


}

