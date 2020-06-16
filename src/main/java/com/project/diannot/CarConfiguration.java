package com.project.diannot;

import com.project.basicDi.Bec;
import com.project.basicDi.EnergieCuantica;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.project")
//com.project
//com.project.bla.bla.bla
//com.project.some.other.class
public class CarConfiguration {


    @Bean
    public Bec bec(){
        Bec b = new Bec(new EnergieCuantica());
        System.out.println("Fac becul pentru a fi pus in lighean");
        return b;
    }


}
