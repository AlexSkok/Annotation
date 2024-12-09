package app;

import app.annotation.Author;
import app.annotation.MethodInfo;

public class Main {
    public static void main(String[] args) {
        try {
            MethodInfo methodInfo = ArrayUtils.class.getDeclaredMethod("annotationMethod").getAnnotation(MethodInfo.class);
            Author author = ArrayUtils.class.getDeclaredMethod("annotationMethod").getAnnotation(Author.class);
            System.out.println("Назва методу " + methodInfo.title());
            System.out.println("Опис методу " + methodInfo.description());
            System.out.println("Type to return: " + methodInfo.returnType());
            System.out.println("Return " + ArrayUtils.class.getDeclaredMethod("annotationMethod").getReturnType());
            System.out.println("Автор методу " + author.author());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}