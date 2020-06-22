package Clothes;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){

        /**
         * 一对多
         * 上衣对类型
         */
        Tops maoyi = new Tops();
        maoyi.setKind("毛衣");
        maoyi.setTopsId(1);
        maoyi.setColor("棕色");
        maoyi.setSize("XL");
        maoyi.setMaterials("毛线");

        Tops jacket = new Tops();
        jacket.setKind("夹克");
        jacket.setTopsId(2);
        jacket.setColor("黑色");
        jacket.setSize("X");
        jacket.setMaterials("skin");

        Pants jeans = new Pants();
        jeans.setKind("牛仔裤");
        jeans.setPantsId(3);
        jeans.setColor("黑色");
        jeans.setSize("XXL");
        jeans.setMaterials("布");

        Pants kuotuiku = new Pants();
        kuotuiku.setKind("阔腿裤");
        kuotuiku.setPantsId(4);
        kuotuiku.setColor("蓝色");
        kuotuiku.setSize("XXL");
        kuotuiku.setMaterials("布");


        /**
         * 多对多
         */
        /**
         * 夹克和牛仔裤
         */
        Relation jacketAndjeans = new Relation();
        jacketAndjeans.setTopsId(jacket.getTopsId());
        jacketAndjeans.setPantsId(jeans.getPantsId());
        jacketAndjeans.setId(7);
        /**
         * 夹克和阔腿裤
         */
        Relation jacketAndkuotuiku = new Relation();
        jacketAndkuotuiku.setTopsId(jacket.getTopsId());
        jacketAndkuotuiku.setPantsId(kuotuiku.getPantsId());
        jacketAndkuotuiku.setId(8);
        /**
         * 毛衣和牛仔裤
         */
        Relation maoyiAndjeans = new Relation();
        maoyiAndjeans.setTopsId(maoyi.getTopsId());
        maoyiAndjeans.setPantsId(jeans.getPantsId());
        maoyiAndjeans.setId(9);
        System.out.println(maoyiAndjeans);
    }
}
