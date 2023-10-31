package com.xiaoma.fruit.dao;

import com.xiaoma.fruit.pojo.Fruit;

import java.util.List;

/**
 * ClassName: FruitDAO
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/10/18 9:39
 * @Version 1.0
 */
public interface FruitDAO {
    //查询库存列表
    List<Fruit> getFruitList();

    //新增库存
    boolean addFruit(Fruit fruit);

    //修改库存
    boolean updateFruit(Fruit fruit);

    //根据名称查询特定库存
    Fruit getFruitByFname(String fname);

    //删除特定库存记录
    boolean delFruit(String fname);
}
