import java.util.*;

public class thisClassIsGoodWeHaveLearnedALotOfThings {
    public static void main(String[] args){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("This");
        treeSet.add("Class");
        treeSet.add("is");
        treeSet.add("good");
        treeSet.add("We");
        treeSet.add("learned");
        treeSet.add("lot");
        treeSet.add("of");
        treeSet.add("things.");
        System.out.println(treeSet);
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            String temp = iterator.next();
            if (temp.charAt(0) == 'C' || temp.charAt(0) == 'o') {
                iterator.remove();
            }
        }
        System.out.println(treeSet);
    }
}
