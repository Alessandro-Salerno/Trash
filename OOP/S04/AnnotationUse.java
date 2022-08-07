import java.lang.annotation.Annotation;

@AnnotationExample(
        firstname = "Alessandro",
        lastname  = "Salerno"
)
public class AnnotationUse {
    /*
     * Displays the class's author information
     */
    public void displayAuthor() throws Exception {
        // Checks if the class actually has the annotation
        // Subclasses may not include it
        if (!getClass().isAnnotationPresent(AnnotationExample.class)) {
            // Throws an exception if the annotation is not found
            throw new Exception("Annotation not present");
        }

        // Get the annotation instance using reflection
        AnnotationExample authorInfo = getClass().getAnnotation(AnnotationExample.class);

        // Display the info
        System.out.println(
                "Author Information:\n"
                    + "\tFirstname: " + authorInfo.firstname() + "\n"
                    + "\tLastname: " + authorInfo.lastname()
        );
    }
}
