package com.community.core.catalog.service.type;

import org.junit.Assert;
import org.junit.Test;


public class GenderTypeTest
{

	@Test
	public void testGetInstance()
	{

		final GenderType genderType = GenderType.getInstance(GenderType.MALE.getType());
		Assert.assertNotNull(genderType);
		Assert.assertTrue(genderType.equals(GenderType.MALE));
		Assert.assertFalse(genderType.equals(GenderType.FEMALE));
		Assert.assertEquals(genderType.hashCode(), GenderType.MALE.hashCode());
		Assert.assertTrue(!genderType.equals(new GenderType()));
	}

	@Test
	public void testForValidType()
	{
		final GenderType genderType = GenderType.getInstance(GenderType.MALE.getType());
		Assert.assertNotNull(genderType);
		Assert.assertTrue(genderType.equals(GenderType.MALE));
		Assert.assertFalse(genderType.equals(GenderType.FEMALE));
		Assert.assertEquals(genderType.hashCode(), GenderType.MALE.hashCode());

	}

	@Test
	public void testForInvalidType()
	{

		final GenderType genderType = GenderType.getInstance("Dummy");
		Assert.assertNull(genderType);
		Assert.assertTrue(!GenderType.MALE.equals(new GenderType()));
		Assert.assertTrue(!GenderType.MALE.equals(GenderType.FEMALE));
	}

	@Test
	public void testFriendlyType()
	{
		Assert.assertNotNull(GenderType.MALE.getFriendlyType());
	}
}
