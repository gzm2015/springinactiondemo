package com.lmk;

import com.lmk.db.Item;
import com.lmk.db.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author LiuMengKe
 * @create 2018-07-16-13:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MongoDbConfig.class)
public class MongoDbTest {

    @Autowired
    MongoOperations mongoOperations;

    @Test
    public void testInject() {
        Assert.assertNotNull(mongoOperations);
    }

    @Test
    public void test1() {

        Order order = new Order();
        order.setId("1");
        order.setClient("tet");


        Item item = new Item();
        item.setId("2");
        item.setName("teti");

        order.getItems().add(item);

        mongoOperations.insert(order);

    }



}
