package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInformation {
    public static void main(String[] args) {
        _Native newNative = new _Native("Joe Doe", "SCV070001");

        Class aClass = newNative.getClass();

        String className = aClass.getSimpleName();
        System.out.printf("The class of aClass: %s%n", className);

        System.out.printf("The following methods are defined in %s:%n", className);
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method: methods) {
            System.out.printf("%7s%n", method.getName());
        }

        System.out.printf("The following fields are defined in %s:%n", className);
        Field[] fields = aClass.getDeclaredFields();
        for (Field field:fields) {
            System.out.printf("%7s%n", field.getName());
        }
    }

}

class _Native{
    private String name;
    private String scv;
    public _Native(String name, String scv) {
        this.name = name;
        this.scv = scv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScv() {
        return scv;
    }

    public void setScv(String scv) {
        this.scv = scv;
    }
}
