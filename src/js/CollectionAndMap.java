package js;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionAndMap {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		System.out.println(s.toString());
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(1, "xiaobai");
		map.put(2, "xiaohei");
		
		Map<Integer, Object> newMap = new HashMap<Integer, Object>();
		newMap.put(3, "xiaobai");
		newMap.put(4, "xiaohei");
		map.putAll(newMap);
		
		//返回map的长度
		int mapSize = map.size();
		//返回该Key值的Value值
		Object value = map.get("1");
		//删除某个Key键值对
		Object value1 = map.remove("2");
		//是否包含某个key
		boolean flag = map.containsKey("1");
		//是否包含某个Value
		boolean flag1 = map.containsValue(value);
		//是否没有元素，size=0
		boolean flag2 = map.isEmpty();
		//删除某个键值对
		boolean flag3 = map.remove("3", "小白");
		//是否与某个Map对象内容相等（只比较内容，元素个数、key值和value值必须一一按顺序匹配）
		Map<Integer, Object> equalMap = new HashMap<Integer, Object>();
		boolean flag4 = map.equals(equalMap);
		//清空整个map元素，但保留长度
		map.clear();
		
		//map 的遍历方式1,使用map的entrySet方法
		Set<Entry<Object, Object>> entrySet = map.entrySet();
		for (Entry<Object, Object> entry:entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}		
		//map 的遍历方式2，使用map的keySet方法返回一个Set<K> 
		Set<Object> keySet= map.keySet();
		for (Object key:keySet) {
			System.out.println(key);
			System.out.println(map.get(key));
		}		
		//与方式2独立使用可以独立遍历key或value值
		Collection<Object> values = map.values();
		for (Object value2:values) {
			System.out.println(value2);
		}		
		//map 的遍历3，使用迭代器,此方法适合遍历链表实现的集合
		Iterator<Map.Entry<Object, Object>> entries = map.entrySet().iterator();		
		while(entries.hasNext()){
			Entry<Object, Object> entry = entries.next();  		  
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
		}
	
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> newList = new ArrayList<Integer>();
		//添加一个元素，该元素下标会根据集合本身具有的元素个数加一
		boolean flag5 = list.add(1);list.add(2);list.add(2);
		//返回list的长度
		int size = list.size();
		//是否包含元素1
		boolean flag6 = list.contains(1);
		//检查list是否为空
		boolean flag7 = list.isEmpty();
		//添加一个集合，添加的集合类型必须继承原集合类型
		boolean flag8 = list.addAll(newList);
		//在固定下标处插入一个元素，即1后面为5，再是2，会改变1以后所有元素下标
		list.add(1, 5);
		//获取某个值第一次出现的下标
		int index = list.indexOf(2);
		//在固定下标处插入一个list，同上
		boolean flag9 = list.addAll(1, newList);
		//去掉某个下标及其值
		list.remove(1);
		//去掉某个集合
		list.removeAll(newList);
		//替换下标1的值为2
		list.set(1, 3);
		//转换成数组
		Object[] objects = list.toArray();
		
		
		//无序不包含重复元素
		Set<Object> set = new HashSet<Object>();
		
		set.add(4);
		set.add(1);	
		set.add(3);
		set.add(2);	
		
		System.out.println(set);
		
		
		
		
		
	}
}
