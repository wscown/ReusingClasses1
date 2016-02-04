import java.util.ArrayList;

/**
 * Created by wscown on 1/26/16.
 */
class ArrayListRotation<E> extends ArrayList {
    public void rotate(int shift){

        int k = shift%this.size();

        //Same effect. Different implementation
        /*
        for(int i = 0; i < k; i++){
            this.add(this.get(0));
            this.remove(0);
        }*/

        this.addAll(this.subList(0, k));
        this.removeRange(0, k);
    }
}


public class ArrayListRotate{

    public static void main(String[] args) {
        ArrayListRotation<String> alr = new ArrayListRotation<String>();

        alr.add("test1");
        alr.add("test2");
        alr.add("test3");
        alr.add("test4");
        alr.add("test5");

        System.out.println(alr.toString());

        alr.rotate(78457);

        System.out.println(alr.toString());
    }

}