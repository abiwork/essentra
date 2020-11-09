package com.community.core.catalog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.client.SupportedFieldType;
import org.broadleafcommerce.core.catalog.domain.ProductImpl;
import org.hibernate.annotations.Index;

import com.community.core.catalog.service.type.GenderType;


/**
 * Extended OOTB Product entity for Heat Clinic client demo.
 * This class holds the entity attribute mappings for persisting product gender type.
 *
 * @version initial
 */
@Entity
@Table(name = "HC_PRODUCT")
public class HCProductImpl extends ProductImpl
{
	private static final long serialVersionUID = 1L;
	private static final int GENDER_TYPE_FIELD_ORDER = 1000;

	@SuppressWarnings("deprecation")
	@Column(name = "GENDER_TYPE")
	@Index(name = "GENDER_TYPE_INDEX", columnNames = { "GENDER_TYPE" })
	@AdminPresentation(friendlyName = "HCProductImpl_GenderType", group = GroupName.General,
			order = GENDER_TYPE_FIELD_ORDER, prominent = true, fieldType = SupportedFieldType.BROADLEAF_ENUMERATION,
			broadleafEnumeration = "com.community.core.catalog.service.type.GenderType",
			gridOrder = 1000)
	protected String genderType;

	/**
	 * This method responsible for returning GenderType enum object which is corresponding to given
	 * genderType set on this entity genderType attribute.
	 *
	 * @return GenderType enum
	 */
	public GenderType getGenderType()
	{
		return GenderType.getInstance(genderType);
	}

	/**
	 * This method responsible for setting the given GenderType's type input into genderType attribute
	 *
	 * @param genderType - GenderType enum value
	 */
	public void setGenderType(final GenderType genderType)
	{
		this.genderType = genderType.getType();
	}
}
