package zuoyeday09;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class zuoye {

//	1、请使用LinkedList来模拟一个队列(先进先出的特性): [必做题]

	@Test
	public void ti01(){
		List<String> staff=new LinkedList<>();
		staff.add("Amy");
		staff.add("Bob");
		staff.add("Carl");
	}
//	1.1 拥有放入对象的方法void put(Object o)
	@Test 
	public void put (Object o){
		
		List<String> staff = null;
		Object o1=staff.iterator();
		
	}

//	1.2 取出对象的方法Object get()
//	1.3 判断队列当中是否为空的方法boolean isEmpty()；
//                              并且，编写测试代码，验证你的队列是否正确。
//2、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，
//并打印到控制台。
//3、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
//红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
}
