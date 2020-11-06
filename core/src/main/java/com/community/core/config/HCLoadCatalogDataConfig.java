package com.community.core.config;

import org.broadleafcommerce.common.demo.AutoImportPersistenceUnit;
import org.broadleafcommerce.common.demo.AutoImportSql;
import org.broadleafcommerce.common.demo.AutoImportStage;
import org.broadleafcommerce.common.demo.ImportCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


/**
 * Configuration class to inject the data load script.
 * This script will be picked as last after OOTB products are loaded.
 * This script holds all incremental and new data updates.
 */
@Configuration
@Conditional(ImportCondition.class)
public class HCLoadCatalogDataConfig
{
	public static final String GENDER_DATA_FILE_LOCATION = "/sql/load_gender_data.sql";

	@Bean
	public AutoImportSql hcLoadCatalogDemoTenantData()
	{
		return new AutoImportSql(AutoImportPersistenceUnit.BL_PU, GENDER_DATA_FILE_LOCATION, AutoImportStage.PRIMARY_LATE);
	}
}
