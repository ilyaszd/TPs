package ma.education.tp.annotations;

public class TestReflectionAnnotation {
    public static void main(String[] args) throws NullPointerException {
        Class c = CalculatriceMath.class;
        Programmer programmer = (Programmer) c.getAnnotation(Programmer.class);
        System.out.println(programmer.id() + ":" + programmer.name());
    }

}
