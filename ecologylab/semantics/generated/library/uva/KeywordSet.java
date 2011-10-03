package ecologylab.semantics.generated.library.uva;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  KeywordSet.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/03/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class KeywordSet extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString type;

	public KeywordSet()
	{ }

	public KeywordSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	type()
	{
		MetadataString	result = this.type;
		if (result == null)
		{
			result = new MetadataString();
			this.type = result;
		}
		return result;
	}

	public String getType()
	{
		return this.type == null ? null : type().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTypeMetadata()
	{
		return type;
	}

	public void setType(String type)
	{
		if (type != null)
			this.type().setValue(type);
	}

	public void setTypeMetadata(ecologylab.semantics.metadata.scalar.MetadataString type)
	{
		this.type = type;
	}
}
