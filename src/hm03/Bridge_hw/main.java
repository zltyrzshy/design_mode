package hm03.Bridge_hw;

import hm03.Bridge_hw.Bridge.*;

public class main {
    public static void main(String args[]){
        FilterDisplay d1 = new FilterDisplay(new DisplayBMPimpl());
        Display d2 = new FilterDisplay(new DisplayJPGimpl());
        Display d3 = new FilterDisplay(new DisplayGIFimpl());
        d1.SharpenDisplay();
        d1.display();
        d2.display();
        d3.display();

    }
}
