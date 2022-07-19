package collectionFramewok;

public class GenricsClass<T>{

        private T t;

    public T getT() {
        return t;
    }
    public void setT(T t){
            this.t=t;
    }

    public static void main(String[] args) {
        GenricsClass<Integer> genricsClass=new GenricsClass<>();
        genricsClass.setT(5);
        System.out.println(genricsClass.getT());

        GenricsClass genricsClass1=new GenricsClass();
        genricsClass1.setT("pune");
        System.out.println(genricsClass1.getT());
    }
}
