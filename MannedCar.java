package dada;
public class MannedCar extends Car implements Manned {
	private int manned;
	public MannedCar(String name,double prise,int people) {
		super(name,prise);//调用父类的构造方法
		this.manned=people;
	}
	@Override
	public String carry() {
		// TODO 自动生成的方法存根
		return "载人:"+manned+"人";
	}

	@Override
	public int getterManned() {
		// TODO 自动生成的方法存根
		return manned;
	}

	@Override
	public void setterManned(int manned) {
		// TODO 自动生成的方法存根
		this.manned=manned;
	}
	
	

}
