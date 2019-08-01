package adapter.adapter;

import adapter.iface.GBSocket;
import adapter.iface.GuoJiSocket;

/**
 * 适配器模式
 * 
 * 		主要作用：将一个类的接口转换成另外一个客户希望的接口
 * 
 * 这个类就相当于实际案例中的电源转换头
 * 
 * @author 怡吾宇
 *
 */
//DBSocket 适配的目标接口
public class GBSocketAdapter implements GuoJiSocket{

	//被适配的接口
	private GBSocket gbSocket;
	
	public GBSocketAdapter(GBSocket gbSocket) {
		this.gbSocket = gbSocket;
	}
	
	
	// 适配之后的方法
	@Override
	public void method() {
		// 实质上调用国标
		gbSocket.method();
	}
}
