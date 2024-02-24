package javaFromScratch;




class freshJuice{
	
	enum freshJuiceSize{Small,Medium,Large};
	
	freshJuiceSize size;
}



public class EnumProgram {
	
	public static void main(String[] args) {
		
		freshJuice juice=new freshJuice();
		juice.size=freshJuice.freshJuiceSize.Small;
		System.out.println(juice.size);
	}
	
	

}
