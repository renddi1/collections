import java.util.*;

public class Main {

//    public ArrayList<String> returnCollection(ArrayList<String> arr ){
//        return arr;
//    }

    public static void main(String[] args) {

////        ArrayList
        ArrayList<String> arrList = new ArrayList();
        arrList.add("Added String");
        arrList.add(1, "String element");
        arrList.get(0);
        arrList.set(0, "Changed String");
        arrList.remove(0);
        arrList.remove("Changed String");
        //       LinkedList
       LinkedList<Integer> linkedList = new LinkedList();
        //       linkedList .add(2);
//     linkedList.add(1, 2);
//        linkedList.get(0); // get by Index
//        linkedList.getFirst();
//        linkedList.getLast();
//      linkedList.set(1, 123); // set by Index element
//        linkedList.remove();
        Integer dellInteger = 123;
        boolean tmp = linkedList.remove(dellInteger);
//       Integer tmp2 = linkedList.remove(2);
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        Set
        HashSet<Long> setList = new HashSet();
        setList.add(321L);
        setList.add(32221L);
       setList.add(322231L);
        setList.add(321111L);
        Iterator iterator = setList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//Map
        Map map = new HashMap<String, List<Integer>>();

        map.put("two", 1);
        map.put("two", 2);
        map.put("two", 3);

        String key = ("one");

        try {

        } catch (Exception e) {
            e.printStackTrace();
      //      System.out.println ("1,2,3,4,5,6") ;

        }
        map.get(key);

   //     map.remove(key = "one");
    //    Set keys = map.keySet();

        for (Object value : map.values()) {
            System.out.println(value);
            System.out.println ("1,2,3,4,5,6") ;
nn
        }

    }
}
