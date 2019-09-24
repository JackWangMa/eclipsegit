
public class demo {

	public static void main(String[] args) {
		int c1,c2,c3;
		 System.out.println("水仙花数为：");
   for(int i=100;i<=999;i++){
			 c1=i/100;
			 c2=(i/10)%10;
			 c3=i%10;
			 if(c1*c1*c1+c2*c2*c2+c3*c3*c3==i){
				 
		       System.out.println("i:"+i);
						 
				 
			 }
			
			
		}

	}

}
