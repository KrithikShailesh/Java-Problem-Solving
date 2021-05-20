import java.util.*;
public class WaterWorld {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
			
		int no_of_days=sc.nextInt();
			
		int no_of_clusters=sc.nextInt();
			
		String[][] clusters=new String[no_of_clusters][3];
			
		for(int i=0;i<no_of_clusters;i++){
		    for(int j=0;j<3;j++){
		        clusters[i][j]=sc.next();
		    }
		}
			
		int queries=sc.nextInt();
			
		String[] cluster=new String[queries];
			
			
		for(int i=0;i<queries;i++){
		    cluster[i]=sc.next();
		}
			
		sc.close();

		int add=0;
			
		for(int i=0;i<no_of_clusters;i++){
			for(int j=0;j<3;j++){
			     String[] parts=cluster[i].split("_");
			         if(parts[0].equals("F") && parts[1].equals(clusters[i][j])){
			             int d=Integer.parseInt(clusters[i][j+2])/Integer.parseInt(clusters[i][j+1]);
			             if(d<no_of_days){
			                  add+=no_of_days*Integer.parseInt(clusters[i][j+2]);
			              }
			              else{
			                  add+=Integer.parseInt(clusters[i][j+2]);
			              }
			         }
			         
			         else if(i>0 && parts[0].equals(clusters[i-1][j]) && parts[1].equals(clusters[i][j])){
			            //int d=Integer.parseInt(clusters[i][j+2])/Integer.parseInt(clusters[i][j+1]);
			          
			                if(Integer.parseInt(clusters[i][j+1])-Integer.parseInt(clusters[i][j+2])==0){
			                    add+=Integer.parseInt(clusters[i][j+2]);
			                }
			                add+=Integer.parseInt(clusters[i-1][j+2])+Integer.parseInt(clusters[i][j+2]);
			                
			        }
			 }
		}
			
			
	System.out.println(add);
    
    }

    
}
