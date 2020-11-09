package com.community.core.catalog.service.type;

import org.junit.Assert;
import org.junit.Test;


public class GenderTypeTest
{

	@Test
	public void testGetInstance()
	{
		final GenderType genderType = GenderType.valueOf("MALE");
		Assert.assertSame(genderType, GenderType.MALE);
	}

	@Test
	public void testFriendlyType()
	{
		Assert.assertEquals(GenderType.MALE.getFriendlyType(), "Male");
	}

	@Test
	public void testType()
	{
		Assert.assertEquals(GenderType.MALE.getType(), "MALE");
	}
}
