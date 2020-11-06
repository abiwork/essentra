package com.community.core.config;

import org.broadleafcommerce.common.demo.AutoImportPersistenceUnit;
import org.broadleafcommerce.common.demo.AutoImportSql;
import org.broadleafcommerce.common.demo.AutoImportStage;
import org.junit.Assert;
import org.junit.Test;


public class HCLoadCatalogDataConfigTest
{
	private static final HCLoadCatalogDataConfig hcLoadCatalogDataConfig = new HCLoadCatalogDataConfig();

	@Test
	public void hcLoadCatalogDemoTenantData()
	{
		final AutoImportSql autoImportSql = hcLoadCatalogDataConfig.hcLoadCatalogDemoTenantData();
		Assert.assertNotNull(autoImportSql);
		Assert.assertEquals(autoImportSql.getPersistenceUnit(), AutoImportPersistenceUnit.BL_PU);
		Assert.assertEquals(autoImportSql.getSqlFilePath(), HCLoadCatalogDataConfig.GENDER_DATA_FILE_LOCATION);
		Assert.assertEquals(autoImportSql.getOrder(), AutoImportStage.PRIMARY_LATE);
	}
}
