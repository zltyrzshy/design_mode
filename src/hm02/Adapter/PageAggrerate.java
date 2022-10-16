package hm02.Adapter;

public class PageAggrerate implements Aggregate{
    private Page[] Pages;
    private  int CurPagesAggrerateSize = 0;

    public PageAggrerate(int totalPages){
        this.Pages = new Page[totalPages];
    }
    public  void addPage(Page onePage){
        this.Pages[CurPagesAggrerateSize] = onePage;
        CurPagesAggrerateSize++;
    }
    public  int getCurPagesAggrerateSize(){
        return this.CurPagesAggrerateSize;
    }
    @Override
    public Iterator iterator() {
        return new PageAggregateIterator(this);
    }
    public Page getPageAt(int index){
        return Pages[index];
    }
}
