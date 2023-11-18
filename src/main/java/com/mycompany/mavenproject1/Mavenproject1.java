/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author Lenovo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //BeanFactory factory =new XmlBeanFactory(new  FileSystemResource("spring.xml"));
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) factory.getBean("Alien");
        obj.code();
        System.out.println(obj.getAge());
    }
}
