package app;

import app.annotation.Author;
import app.annotation.MethodInfo;

public class ArrayUtils {
    @MethodInfo(title = "Method in class ArrayUtil", description = "For annotation hometask")
    @Author(author = "Alex Skok")
    public void annotationMethod(){
        System.out.println("Test nethod for annotation hometask");
    }
}
