package com.atguigu;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4jTest {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader=new SAXReader();
        Document doc=reader.read("./XML_Tomcat/src/books.xml");
//        System.out.println(doc);
        Element root=doc.getRootElement();
        List<Element> books=root.elements("book");
        for(Element book :books){
            Book b=new Book(book.element("name").getText(),Double.valueOf(book.element("price").getText()));
            System.out.println(b);
        }
    }
}
