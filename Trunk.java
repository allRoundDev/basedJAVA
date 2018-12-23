package dada;
public class Trunk extends Car implements Load {
	private double load;

	public Trunk(String name,double prise,double load) {
		// TODO 自动生成的构造函数存根
		super(name,prise);//调用父类的构造方法
		this.load=load;
	}
	@Override
	public String carry() {
		// TODO 自动生成的方法存根
		return "载重："+load+"吨";
	}
	@Override
	public double getterLoad() {
		// TODO 自动生成的方法存根
		return load;
	}


	@Override
	public void setterLoad(double load) {
		// TODO 自动生成的方法存根
		this.load=load;
	}



}
