import java.util.*;

public class Snack{
    static class Pack {
        int reach;
        int cook;
        int tag;
        Pack(int reach, int cook, int tag){
            this.reach=reach;
            this.cook=cook;
            this.tag=tag;
        }
    }
    private static int getChairs(List<Pack> info){
       info.sort(Comparator.comparingInt(a->a.reach));
       PriorityQueue<Pack> l = new PriorityQueue<>((a,b)->{
       if(a.tag!=b.tag) return b.tag-a.tag;
       if(a.reach!=b.reach) return a.reach-b.reach;
       return a.cook-b.cook;
       });
       int m=0,idx=0,w=0,maxW=0;
       while(idx<info.size() || !l.isEmpty()){
           if(l.isEmpty() && idx<info.size()){
                m=Math.max(m,info.get(idx).reach);
           }
           while(idx<info.size() && info.get(idx).reach<=m){
               l.offer(info.get(idx++));
           }
           if(!l.isEmpty()){
               Pack act=l.poll();
               m+=act.cook;
               while(idx<info.size() && info.get(idx).reach<=m){
                   l.offer(info.get(idx++));
               }
           }
           w=l.size();
          maxW=Math.max(maxW,w);
      }
      return maxW;
    }
    public static void main(String args[]){
      try{
        Scanner sc= new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int T=sc.nextInt();
        List<Pack> tasks = new ArrayList<>();
        for(int i=0;i<T && sc.hasNextInt();i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            tasks.add(new Pack(x,y,z));
        }
        System.out.println(getChairs(tasks));
     }
     catch(Exception e){
        System.out.println(0);
     }
   }
 }