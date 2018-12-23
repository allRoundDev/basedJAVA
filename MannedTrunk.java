package dada;

public class MannedTrunk extends Car implements Load,Manned {
 private int people;
 private double load;
	public MannedTrunk(String name,double prise,int people,double load) {
	// TODO 自动生成的构造函数存根
	 super(name,prise);//调用父类的构造方法
	 this.people=people;
	 this.load=load;
	 }
 public String carry() {
	 return "载人："+people+"人"+" "+"载重："+load+"吨";
 }
	@Override
	public int getterManned() {
		// TODO 自动生成的方法存根
		return people;
	}

	
	@Override
	public double getterLoad() {
		// TODO 自动生成的方法存根
		return load;
	}

	
	
	@Override
	public void setterManned(int Manned) {
		// TODO 自动生成的方法存根
		this.people=Manned;
	}
	@Override
	public void setterLoad(double load) {
		// TODO 自动生成的方法存根
		this.load=load;
	}

}
