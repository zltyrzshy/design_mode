package hm02.Adapter;

public class PageAggregateIterator implements  Iterator{
    private PageAggrerate pageAggrerate;
    private int index;
    public PageAggregateIterator(PageAggrerate pageAggrerate){
        this.pageAggrerate = pageAggrerate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index<this.pageAggrerate.getCurPagesAggrerateSize());
    }

    @Override
    public Object next() {
        Page page = pageAggrerate.getPageAt(index);
        index++;
        return page;
    }
}
