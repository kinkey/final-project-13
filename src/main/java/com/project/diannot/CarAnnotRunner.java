package com.project.diannot;

import com.project.basicDi.Bec;
import com.project.dixml.Car;
import com.project.dixml.Parcare;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class CarAnnotRunner {

    public static void main(String[] args) {



        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("new String('hello world')");
        String message = exp.getValue(String.class);
        String message2 = message.toUpperCase();
        System.out.println(message2);
    }
}
