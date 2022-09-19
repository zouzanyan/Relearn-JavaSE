package 常用类;

import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        /*
        * StringBuilder 类是可变的。它是 String 的对等类，它可以增加和编写字符的可变序列，并且能够将字符插入到字符串中间或附加到字符串末尾（
        * 当然是不用创建其他对象的）。
        * */

        System.out.println(System.currentTimeMillis());

        Date date = new Date();
        System.out.println(date);

        StringBuilder s = new StringBuilder(); // stringbuilder是线程不安全的
        s.append("java"); // 在后面添加字符串
        s.insert(0,"I love "); // 在0的位置添加字符串
        String s1 = s.toString();
        System.out.println(s1);


        //集合框架是为表示和操作集合而规定的一种统一的标准的体系结构。任何集合框架都包含三大内容：对外的接口、接口的实现和对集合运算的算法。

        /*
        * Collection 接口是 Java 集合框架里的一个根接口。它也是 List、Set 和 Queue 接口的父接口。Collection 接口中定义了可用于操作 Li
        * st、Set 和 Queue 的方法——增删改查。
        *
        * `List` 是一个接口，**不能实例化**，需要一个具体类来实现实例化。
        * */

        Collection<String> ad = new ArrayList<>();
        ad.add(s1);
        System.out.println(ad);

        /*
        * Map 接口也是一个非常重要的集合接口，用于存储键 / 值对。Map 中的元素都是成对出现的，键值对就像数组的索引与数组的内容的关系一样，将一个
        * 键映射到一个值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。我们可以通过键去找到相应的值。
        * `value` 可以存储任意类型的对象，我们可以根据 `key` 键快速查找 `value`。Map 中的键 / 值对以 Entry 类型的对象实例形式存在。
        * */

        /*
        * `HashMap` 是基于哈希表的 Map 接口的一个重要实现类。HashMap 中的 Entry 对象是 `无序` 排列的，Key 值和 `value` 值都可以为
        * `null`，但是一个 HashMap 只能有一个 `key` 值为 `null` 的映射（`key`
         * */
        Map<String,Object> map = new HashMap<>();
        map.put("awd","wdad");
        map.put("awfdw4","awdw");
        System.out.println(map.get("awd"));
        System.out.println(map.entrySet()); // 返回此映射中包含的映射关系的 Set 视图
        System.out.println(map.keySet());
        System.out.println(map.containsKey("awd"));  // 如果此映射包含指定键的映射关系，则返回 true


        /*
        * Set 接口也是 Collection 接口的子接口，它有一个很重要也是很常用的实现类——HashSet，Set 是元素无序并且不包含重复元素的 collection
        * （List 可以重复），被称为集。
            HashSet 由哈希表（实际上是一个 HashMap 实例）支持。它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。
        * */

        List<Integer> list = new ArrayList<Integer>();
        //赋值
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(12);
        System.out.print("初始顺序：");
        list.forEach(v -> System.out.print(v + "\t"));


        //打乱顺序
        Collections.shuffle(list);
        System.out.print("\n打乱顺序：");
        list.forEach(v -> System.out.print(v + "\t"));

        //反转
        Collections.reverse(list);
        System.out.print("\n反转集合：");
        list.forEach(v -> System.out.print(v + "\t"));

        //第一个位和最后一位交换
        Collections.swap(list,0,list.size()-1);
        System.out.print("\n交换第一位和最后一位：");
        list.forEach(v -> System.out.print(v + "\t"));

        //按自然升序排序
        Collections.sort(list);
        System.out.print("\nSort排序后：");
        list.forEach(v -> System.out.print(v + "\t"));

        //二分查找 必须排序后
        System.out.print("\n二分查找数值7的位置："+Collections.binarySearch(list, 7));

        //返回线程安全的list
        List<Integer> synchronizedList = Collections.synchronizedList(list);
    }

    }

