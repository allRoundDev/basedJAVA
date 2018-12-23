package dada;



public class Main {
	Input i=new Input();

	//int j1;
	//定义一个车类型的数组
	public static final Car[] cars= {
			new MannedCar("奥迪A4", 500, 4),
			new MannedCar("马自达6", 400, 4),
			new MannedTrunk("皮卡雪6", 800, 4, 2),
			new MannedCar("金龙", 800, 20),
			new Trunk("松花江", 400, 4),
			new Trunk("依维柯", 1000, 20)

	};
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.printf("欢迎您使用dada租车系统：%n您是否要租车？\r1、是     0、否\n");
		Main m1=new Main();
		m1.judge();
	}
	public void judge() {
		int j=i.input();

		if(j==1) {

			this.showTab();
		}else
			if(j==0){
				System.out.println("欢迎您再次使用本系统");
			}else {                                            //输入非0或1时系统不会崩溃
				while(j!=0 && j!=1) {
					System.out.println("请重新输入0或1，谢谢");
					this.judge();
				}

			}

	}
	public void showTab(){
		System.out.printf("您可租车的类型及其价目表：\r序号\t汽车名称\t租金\t容量\n");
		for(int j=0;j<cars.length;j++) {
			System.out.printf("%d\t%s\t%.2f\t%s%n",j+1,cars[j].getterName(),cars[j].getterPrise(),cars[j].carry());
		}

		System.out.println("请输入您想租用的汽车数量：");
		final int j=i.input();

		this.fewCars(j);
	}
	public void fewCars(final int j) {

		int few[]=new int[cars.length];
		for(int j1=0;j1<j;j1++) {
			System.out.printf("请输入第%d辆车的序号：\n",j1+1);
			int num=i.input();
			if(num>=1&&num<=cars.length) {
				few[num-1]++;
			}else {
				System.out.println("请输入上文中显示的车辆编号，谢谢。");

				this.fewCars(j);
				break;
			}

		}
		this.bill(few);
	}
	public void bill(int[] few) {
		System.out.println("请输入租车的天数：");
		final int day=i.input();
		double money=0.00;
		System.out.println("您的账单如下：");
		//输出载人的部分
		System.out.println("*****可载人的车有：*****");
		int seat=0;
		for(int i=0;i<few.length;i++) {
			if(few[i]!=0 && cars[i] instanceof Manned) {
				System.out.printf("%d辆%s ",few[i],cars[i].getterName());
				seat+=((Manned)cars[i]).getterManned()*few[i];
				money+=cars[i].getterPrise()*few[i];
			}
		}
		System.out.printf("\t共载人:%d人\n",seat);
		//输出载货的部分
		System.out.println("*****可载货的车有:*****");
		int load=0;
		for(int i=0;i<few.length;i++) {
			if (few[i]!=0 && cars[i] instanceof Load) {
				System.out.printf("%d辆%s ",few[i],cars[i].getterName());
				load+=((Load)cars[i]).getterLoad()*few[i];
				money+=cars[i].getterPrise()*few[i];
			}	
		}
		System.out.printf("\t共载货:%d吨\n",load);
		System.out.printf("*****租车的总价格为：%.2f元*****",money);
	}
}



