package com.jack.designMode.structure.Adapter2018;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    public List getEmpBy(String id){
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        return list;
    }
}