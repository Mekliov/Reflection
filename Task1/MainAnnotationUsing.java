package Task1;

import java.lang.annotation.Annotation;

public class MainAnnotationUsing {

    public static void main(String[] args) {
        AnnotatedClass myClass = new AnnotatedClass();
        Annotation[] myAnnotation = myClass.getClass().getAnnotations();
        System.out.println(myClass.getClass().getAnnotation(ClassInfo.class));
        for (Annotation a : myAnnotation) {
            System.out.println(a);
        }

    }

}
