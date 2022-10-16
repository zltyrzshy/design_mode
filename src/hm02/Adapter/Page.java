package hm02.Adapter;

public class Page {
    private int Page_num;
    private String Page_content;

    public Page(String page){
        this.Page_content = page;
    }

    public int getPage_num(){
        return this.Page_num;
    }

    public String getPage_content() {
        return Page_content;
    }
}
