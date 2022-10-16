package hm02.Adapter;

public class Main {

    public static void main(String args[]){
        PageAggrerate pageAggrerate = new PageAggrerate(10);
        int i;
        for(i=0;i<10;i++) {
            pageAggrerate.addPage(new Page("Page" + i));
        }
        Iterator it = pageAggrerate.iterator();
        while(it.hasNext()){
            Page page = (Page)it.next();
            System.out.println(page.getPage_content());
        }
    }
}
