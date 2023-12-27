package AbstractM;

abstract class Numbers {
	int a;
	int b;
	Numbers(int a,int b){
		this.a=a;
		this.b=b;
	}

	abstract int add(int a,int b);
	abstract double add(double a,double b);
	abstract double add(double a,int b);
	abstract double add(int a,double b);
	abstract int sub(int a,int b);
	abstract double sub(double a,double b);
	abstract double sub(double a,int b);
	abstract double sub(int a,double b);
	abstract int mul(int a,int b);
	abstract double mul(double a,double b);
	abstract double mul(double a,int b);
	abstract double mul(int a,double b);
	abstract int div(int a,int b);
	abstract double div(double a,double b);
	abstract double div(double a,int b);
	abstract double div(int a,double b);
	abstract int mod(int a,int b);
	abstract int mod(double a,double b);
	abstract int mod(double a,int b);
	abstract int mod(int a,double b);
}
