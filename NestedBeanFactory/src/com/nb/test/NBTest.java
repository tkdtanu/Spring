package com.nb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nb.beans.Person;

public class NBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory1=new XmlBeanFactory(new ClassPathResource("com/nb/common/parrent.xml"));
		BeanFactory factory2=new XmlBeanFactory(new ClassPathResource("com/nb/common/child.xml"),factory1);
		Person p1=(Person) factory2.getBean("person");
		System.out.println(p1);
		
	}

}
