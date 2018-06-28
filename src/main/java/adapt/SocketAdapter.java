package adapt;
public class SocketAdapter implements DBSocketInterface{   //实现旧接口
 
	//组合新接口
	private GBSocketInterface gbSocket;
	
	/**
	 * 在创建适配器对象时，必须传入一个新街口的实现类
	 * @param gbSocket
	 */
	public SocketAdapter(GBSocketInterface gbSocket) {
		this.gbSocket = gbSocket;
	}
 
	
	/**
	 * 将对就接口的调用适配到新接口
	 */
	@Override
	public void powerWithTwoRound(int a,int b,int c) {
		//换成自己的方法
		gbSocket.powerWithThreeFlat();
	}
 
}