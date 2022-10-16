package hm02.Prototype_hw.resume;

import lombok.AllArgsConstructor;
import hm02.Prototype_hw.framework.Product;
import lombok.NoArgsConstructor;

@AllArgsConstructor

public class Resume implements Product {
    String name;
    int age;
    String photo;
    /*
    在某在线招聘网站中，用户可以创建一个简历模板。
    针对不同的工作岗位，可以复制该简历模板并进行适当修改后，生成一份新的简历。
    在复制简历时，用户可以选择是否复制简历中的照片：
    如果选择“是”，则照片将一同被复制，用户对新简历中的照片进行修改不会影响到简历模板中的照片，对模板进行修改也不会影响到新简历；
    如果选择“否”，则直接引用简历模板中的照片，修改简历模板中的照片将导致新简历中的照片一同修改，反之亦然。
    现采用原型模式设计该简历复制功能并提供浅克隆和深克隆两套实现方案，绘制对应的类图并编程模拟实现。
    */
    @Override
    public void use(String s) {

    }

    @Override
    public Product createClone() {
        Product p;
        try {
            p= (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }

    @Override
    public Product createDeepClone() {
        Product p;
        try {
            p= (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;    }
}
