public class test {

    public static void main(String[] args) {

        Box<String> name = new Box<String>("corn");
        Box<Integer> age = new Box<Integer>(712);

        System.out.println("name class:" + name.getClass());      // com.qqyumidi.Box
        System.out.println("age class:" + age.getClass());        // com.qqyumidi.Box
        System.out.println(name.getClass() == age.getClass());    // true
    }

}

class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}