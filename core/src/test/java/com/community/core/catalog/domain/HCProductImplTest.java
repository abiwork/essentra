package com.community.core.catalog.domain;

import com.community.core.catalog.service.type.GenderType;
import org.junit.Assert;
import org.junit.Test;


public class HCProductImplTest {
   private static final HCProductImpl hcProduct = new HCProductImpl();

   @Test
    public void testGenderType(){
       hcProduct.setGenderType(GenderType.MALE);
       GenderType genderType = hcProduct.getGenderType();
       Assert.assertNotNull(genderType);
       Assert.assertEquals(genderType, GenderType.MALE);
   }

}