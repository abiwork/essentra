package com.community.core.catalog.service.type;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.broadleafcommerce.common.BroadleafEnumerationType;


/**
 * This class extends  BroadleafEnumerationType  for GenderType.
 * And holds Code for Enum and friendly Name(Label)
 */
public class GenderType implements Serializable, BroadleafEnumerationType
{

	private static final long serialVersionUID = 1L;

	private static final Map<String, GenderType> TYPES = new LinkedHashMap<>();

	public static final GenderType MALE = new GenderType("MALE", "Male");
	public static final GenderType FEMALE = new GenderType("FEMALE", "Female");
	public static final GenderType UNISEX = new GenderType("UNISEX", "Unisex");

	/**
	 * Default constructor
	 */
	public GenderType()
	{
		//do nothing
	}

	/**
	 * Returns the GenderType enum object for matching input type from its cached map.
	 *
	 * @param type - Type code of GenderType enum
	 * @return GenderType enum
	 */
	public static GenderType getInstance(final String type)
	{
		return TYPES.get(type);
	}

	private String type;
	private String friendlyType;

	/**
	 * Constructor with type & friendly type input params
	 *
	 * @param type         - Gender Type code
	 * @param friendlyType - Gender Type friendly names
	 */
	public GenderType(final String type, final String friendlyType)
	{
		this.friendlyType = friendlyType;
		setType(type);
	}

	@Override
	public String getType()
	{
		return type;
	}

	@Override
	public String getFriendlyType()
	{
		return friendlyType;
	}

	/**
	 * Sets the GenderType object into cached map
	 *
	 * @param type
	 */
	private void setType(final String type)
	{
		this.type = type;
		if (!TYPES.containsKey(type))
		{
			TYPES.put(type, this);
		}
	}
}
