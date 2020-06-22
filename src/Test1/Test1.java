package Test1;

import Clothes.Relation;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args){
        /**
         * 上衣
         */
        List<Tops> topsList = new ArrayList<>();

        Tops chenshan = new Tops();
        chenshan.setTopsId(11);
        chenshan.setTopsKind("衬衫");
        chenshan.setTopsColor("白色");
        chenshan.setTopsSize("X");

        Tops jeans = new Tops();
        jeans.setTopsId(12);
        jeans.setTopsKind("夹克");
        jeans.setTopsColor("黑色");
        jeans.setTopsSize("XL");

        Tops maoyi = new Tops();
        maoyi.setTopsId(13);
        maoyi.setTopsKind("毛衣");
        maoyi.setTopsColor("灰色");
        maoyi.setTopsSize("X");

        topsList.add(chenshan);
        topsList.add(jeans);
        topsList.add(maoyi);
        System.out.println(topsList);

        /**
         * 裤子
         */
        List<Pants> pantsList = new ArrayList<>();

        Pants kuotuiku = new Pants();
        kuotuiku.setPantsId(21);
        kuotuiku.setPantsKind("阔腿裤");
        kuotuiku.setPantsColor("棕色");
        kuotuiku.setPantsSize("XL");

        Pants niuzaiku = new Pants();
        niuzaiku.setPantsId(22);
        niuzaiku.setPantsKind("牛仔裤");
        niuzaiku.setPantsColor("黑yan色");
        niuzaiku.setPantsSize("XL");

        Pants yundongku = new Pants();
        yundongku.setPantsId(23);
        yundongku.setPantsKind("运动裤");
        yundongku.setPantsColor("白色");
        yundongku.setPantsSize("X");

        pantsList.add(kuotuiku);
        pantsList.add(niuzaiku);
        pantsList.add(yundongku);
        System.out.println(pantsList);

        /**
         * 上衣裤子的搭配
         */
        List<Relations> relationsList = new ArrayList<>();

        Relations dapei1 = new Relations();
        dapei1.setId(1);
        dapei1.setTopsId(chenshan.getTopsId());
        dapei1.setTopsKind(chenshan.getTopsKind());
        dapei1.setPantsId(kuotuiku.getPantsId());
        dapei1.setPantsKind(kuotuiku.getPantsKind());

        Relations dapei2 = new Relations();
        dapei2.setId(2);
        dapei2.setTopsId(chenshan.getTopsId());
        dapei2.setTopsKind(chenshan.getTopsKind());
        dapei2.setPantsId(niuzaiku.getPantsId());
        dapei2.setPantsKind(niuzaiku.getPantsKind());

        Relations dapei3 = new Relations();
        dapei3.setId(3);
        dapei3.setTopsId(chenshan.getTopsId());
        dapei3.setTopsKind(chenshan.getTopsKind());
        dapei3.setPantsId(yundongku.getPantsId());
        dapei3.setPantsKind(yundongku.getPantsKind());

        Relations dapei4 = new Relations();
        dapei4.setId(4);
        dapei4.setTopsId(jeans.getTopsId());
        dapei4.setTopsKind(jeans.getTopsKind());
        dapei4.setPantsId(kuotuiku.getPantsId());
        dapei4.setPantsKind(kuotuiku.getPantsKind());

        relationsList.add(dapei1);
        relationsList.add(dapei2);
        relationsList.add(dapei3);
        relationsList.add(dapei4);
        System.out.println(relationsList);



    }
}
