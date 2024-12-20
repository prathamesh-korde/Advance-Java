public class generic <t1,t2>{
    public void display(t1 var1 , t2 var){
        System.out.println("var 1-"+var1+"var 2-"+var);
    }
    public static void main(String[] args) {
        generic<String,Integer> obj = new  generic<String,Integer>();
        obj.display("pram0", 152);
    }
}
