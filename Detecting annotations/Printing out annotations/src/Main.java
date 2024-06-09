import java.lang.annotation.Annotation;

class AnnotationUtils {

    public static void printClassAnnotations(Class classObject) {
        // write your code here
        for (Annotation annotation : classObject.getDeclaredAnnotations()) {
            // Print the simple name of the annotation
            System.out.println(annotation.annotationType().getSimpleName());
        }
    }

}
