public class display {
    private int value=20;
    private int limit=24;

    public display(int limit,int value){
        this.limit=limit;
        this.value=value;
    }

    public void increase(){
        value++;
        if(value==limit){
            value=0;
        }
    }

    public int getValue(){
        return value;
    }

    public static void main(String[]args){
        display d=new display(24,20);
        while(true){
            d.increase();
            System.out.println(d.getValue());
        }
    }
}