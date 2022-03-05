package challange;

import java.time.LocalDate;

import challange.content.*;
import challange.bootcamps.*;

public class Menu {
    
    public static void main(String[] args) {

        Content course = new Course("Java", "Java para iniciantes", 30);
        Content course2 = new Course("JavaScript", "JavaScript para iniciantes", 30);
        Content mentorship = new Mentorship("Python", "Mentoria de Python", LocalDate.now());
        Content mentorship2 = new Mentorship("Java", "Mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.addContent(course);
        bootcamp.addContent(course2);
        bootcamp.addContent(mentorship);
        bootcamp.addContent(mentorship2);

        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescription("Curso de Java para iniciantes");

        Dev devJohn = new Dev();

        devJohn.setName("John");
        devJohn.subscribeToBootcamp(bootcamp);
        System.out.println(devJohn.getSubscribedContents() + "\n\n");
        devJohn.advance();
        System.out.println(devJohn.getFinishedContents() + "\n\n");
        System.out.println(devJohn.calcTotalXp());
        devJohn.advance();
        System.out.println(devJohn.getFinishedContents());
        System.out.println(devJohn.calcTotalXp());
    }

}