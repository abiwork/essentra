package com.community.core.catalog.domain;

import org.broadleafcommerce.common.BroadleafEnumerationType;
import org.junit.Assert;
import org.junit.Test;


public class HCProductImplTest
{
   private static final HCProductImpl hcProduct = new HCProductImpl();

   @Test
   public void testGenderType()
   {
      hcProduct.setGenderType("MALE");
      final BroadleafEnumerationType genderType = hcProduct.getGenderType();
      Assert.assertNotNull(genderType);
      Assert.assertEquals(genderType.getType(), "MALE");
   }

}
