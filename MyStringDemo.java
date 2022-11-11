import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MyStringDemo{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> c = Class.forName("Student");
        Constructor<?> con = c.getConstructor(String.class,int.class);
        Object obj = con.newInstance("ÀîÔÆÈð",55);
        System.out.println(obj);
    }
    
}