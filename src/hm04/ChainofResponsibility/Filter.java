package hm04.ChainofResponsibility;

import lombok.AllArgsConstructor;
import lombok.Setter;

public abstract class Filter {
    private Filter next;

    public final void support(Trouble trouble) {
        for (Filter filter = this; true; filter = filter.next) {
            if (filter.resolve(trouble)) {
                done(trouble);
                break;
            } else if (filter.next == null) {
                fail(trouble);
                break;
            }
        }
    }

    public abstract boolean resolve(Trouble trouble);

    public Filter setNext(Filter filter){
        this.next = filter;
        return next;
    }

    public void done(Trouble trouble) {
        System.out.println("done  " + trouble.getContent());
    }

    public void fail(Trouble trouble) {
        System.out.println("fail" + trouble.toString());

    }
}
