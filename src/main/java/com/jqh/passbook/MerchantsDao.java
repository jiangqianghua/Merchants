package com.jqh.passbook;

import com.jqh.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: jiang qiang hua
 * @Description:<h1></h1>
 * @Date: Create in 10:22 2019/1/13
 * @Modified By:
 **/
public interface MerchantsDao extends JpaRepository<Merchants , Integer> {

    /**
     * <h2>根据id查找商户对象</h2>
     * @param id
     * @return
     */
    Merchants findById(Integer id) ;

    /**
     * <h2>根据名字查找商户对象</h2>
     * @param name
     * @return
     */
    Merchants findByName(String name);

}
