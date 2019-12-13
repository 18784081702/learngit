import java.util.*;
public class test {
    private String str;
    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str=str;
    }
    public boolean equals(Object aa){
        if (aa==this) {
            return true;
        }
        return false;
    }
    public int hashCode(){
        int hash=0;
        if(str!=null){
            for(char c:str.toCharArray()){
                hash+=c;
            }
        }
        return hash;
    }
    public static void main(String[] args) {
        List<String> a=new ArrayList();
        a.add("11");
        a.add("22");
        a.add("33");
        Iterator it=a.iterator();
        while(it.hasNext()){
            String man=(String)it.next();
            System.out.println(man);
        }
        System.out.println(a.isEmpty());
        HashMap<String,Integer> b=new HashMap();
        b.put("ming",18);
        b.put("gang",17);
        Iterator<String> its=b.keySet().iterator();
        while(its.hasNext()){
            String man= its.next();
            System.out.println(man);
        }
        System.out.println(b.isEmpty());
    }
}
