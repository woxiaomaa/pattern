package adapt;
/**
 * 中国插座
 */
public class GBSocket implements GBSocketInterface{
	
	@Override
	public void powerWithThreeFlat() {		//因为GBSocket没有参数，所以不能直接实现DBSocketInterface接口
		System.out.println("使用三项扁头插孔供电");
	}
}