import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Coloring {

	
	public class Graph {
		int vertices;
		List<Integer> adjacency[];
		Graph(int total){
			this.vertices=total;
			adjacency=new ArrayList[total];
			for(int i=0;i<vertices;i++) {
				adjacency[i]=new ArrayList<Integer>();
			}
		}
		
		public void addEdge(int x,int y) {
			
			adjacency[x].add(y);
		}
		
	}
	
//	public int MinColors(List<Integer> a[]) {
//	int colors=0;
//	boolean flag=false;
//	Deque<Integer> dq=new LinkedList<Integer>();
//	dq.add(1);
//	
//	while(!dq.isEmpty()){
//		
//		Integer current=null;
//		if(flag==false) {
//		current=dq.peekLast()-1;
//		}
//		else {
//			current=dq.peek()-1;
//		}
//		
//		for(int i=0;i<a[current].size();i++) {
//			if(dq.contains(a[current].get(i))) {
//				continue;
//			}
//			else {
//				dq.add(a[current].get(i));
//				flag=true;
//				break;
//			}
//		}
//		
//		if(flag==true&&dq.size()!=a.length) {
//			flag=false;
//			continue;
//		}
//		else if(dq.size()!=a.length) {
//			flag=true;
//			
//			continue;
//		}
//		
//		colors=Helper(dq,a);
//		
//		break;
//	}
//	
//	return colors;
//	}
//	
//	
//	public int Helper(Deque<Integer> dq,List<Integer> a[]) {
//		int colors=0;
//		HashSet<Integer> hs=new HashSet<Integer>();
//		System.out.println(dq.size());
//		while(!dq.isEmpty()) {
//			int temp=dq.pop();
//			
//			if(!hs.isEmpty()) {
//				int counter=0;
//				for(int i=0;i<a[temp-1].size();i++) {
//					if(hs.contains(a[temp-1].get(i))) {
//						counter++;
//					}
//				}
//				if(counter==hs.size()) {
//					colors++;
//				}
//				hs.add(temp);
//			}
//			else {
//				colors++;
//				hs.add(temp);
//			}
//		}
//		
//		return colors;
//	}
	
	
	public int minColor(List<Integer> a[]) {
		int colors=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			colors=Math.min(a[i].size(), colors);
		}
		return colors+1;
	}
	
	
	public static void main(String args[]) {
		
		try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line=null;
	    int count=0;
	    List<Integer> l[];
	    Coloring c=null;
	    Graph g=null;
	    while((line = br.readLine())!=null) {
	    	
	    	if(line.length()==1) {
	            count=0;
	    		l=new ArrayList[Integer.valueOf(line)];
	    		c=new Coloring();
	    		g=c.new Graph(Integer.valueOf(line));
	    		
	    	}
	    	else  {
	    		String[] s=line.split("");
	    		for(int i=0;i<s.length;i++) {
	    			if(s[i].compareTo("0")==0) {
	    				continue;
	    			}
	    			else {
	    				g.addEdge(count, i+1);
	    			}
	    		}
	    		count++;
	    	}
	    	
	    	if(count==g.vertices) {
	    	System.out.println(c.minColor(g.adjacency));
	    	}
	    }
	    br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
