package com.xiaoma.fruit.dao.impl;

import com.xiaoma.fruit.dao.FruitDAO;
import com.xiaoma.fruit.pojo.Fruit;
import com.xiaoma.myssm.basedao.BaseDAO;

import java.util.List;

public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO {
    @Override
    public List<Fruit> getFruitList() {
        return super.executeQuery("select * from t_fruit");
    }
}
